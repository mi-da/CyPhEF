package prova.src.lnu.entities;



import java.util.ArrayList;

public class PhysicalNode {
	
    private String name;
    private ArrayList<String> attributes;
    
    public PhysicalNode() {
    	attributes = new ArrayList<String>();
    }
    
    public ArrayList<String> getAttributes() {
    	return attributes;
    }
    
    public void addAttribute(String attribute) {
    	attributes.add(attribute);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
