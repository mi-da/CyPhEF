/*
 * Copyright (c) 2003-2005 The BISON Project
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 2 as
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 */
		
package peersim.graph;

import java.util.*;

/**
* This class is an adaptor making any Graph an undirected graph
* by making its edges bidirectional. The graph to be made undirected
* is passed to the constructor. Only the reference is stored so
* if the directed graph changes later, the undirected version will
* follow that change. However, {@link #getNeighbours} has O(n) time complexity
* (in other words, too slow for large graphs).
* @see ConstUndirGraph
*/
public class UndirectedGraph implements Graph {


// ====================== private fileds ========================
// ==============================================================


private final Graph g;


// ====================== public constructors ===================
// ==============================================================


public UndirectedGraph( Graph g ) {

	this.g = g;
}


// ======================= Graph implementations ================
// ==============================================================


@Override
public boolean isEdge(int i, int j) {
	
	return g.isEdge(i,j) || g.isEdge(j,i);
}

// ---------------------------------------------------------------

/**
* Uses sets as collection so does not support multiple edges now, even if
* the underlying directed graph does.
*/
@Override
public Collection<Integer> getNeighbours(int i) {
	
	Set<Integer> result = new HashSet<Integer>();
	result.addAll(g.getNeighbours(i));
	final int max = g.size();
	for(int j=0; j<max; ++j)
	{
		if( g.isEdge(j,i) ) result.add(j);
	}

	return Collections.unmodifiableCollection(result);
}

// ---------------------------------------------------------------

@Override
public Object getNode(int i) { return g.getNode(i); }
	
// ---------------------------------------------------------------

/**
* If there is an (i,j) edge, returns that, otherwise if there is a (j,i)
* edge, returns that, otherwise returns null.
*/
@Override
public Object getEdge(int i, int j) {
	
	if( g.isEdge(i,j) ) return g.getEdge(i,j);
	if( g.isEdge(j,i) ) return g.getEdge(j,i);
	return null;
}

// ---------------------------------------------------------------

@Override
public int size() { return g.size(); }

// --------------------------------------------------------------------
	
@Override
public boolean directed() { return false; }

// --------------------------------------------------------------------

/** not supported */
@Override
public boolean setEdge( int i, int j ) {
	
	throw new UnsupportedOperationException();
}

// ---------------------------------------------------------------

/** not supported */
@Override
public boolean clearEdge( int i, int j ) {
	
	throw new UnsupportedOperationException();
}

// --------------------------------------------------------------------

@Override
public int degree(int i) {
	
	return getNeighbours(i).size();
}

// --------------------------------------------------------------------
/*
public static void main( String[] args ) {

	
	Graph net = null;	
	UndirectedGraph ug = new UndirectedGraph(net);
	for(int i=0; i<net.size(); ++i)
		System.err.println(i+" "+net.getNeighbours(i));
	System.err.println("============");
	for(int i=0; i<ug.size(); ++i)
		System.err.println(i+" "+ug.getNeighbours(i));
	for(int i=0; i<ug.size(); ++i)
	{
		for(int j=0; j<ug.size(); ++j)
			System.err.print(ug.isEdge(i,j)?"W ":"- ");
		System.err.println();
	}

	GraphIO.writeGML(net,System.out);
}
*/
}


