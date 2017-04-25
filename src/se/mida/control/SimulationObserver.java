package se.mida.control;

import peersim.core.Control;

public class SimulationObserver implements Control {

	private String name;

	public SimulationObserver(String name) {
		this.name = name;
	}
	
	@Override
	public boolean execute() {
		System.out.println("Simulation Observer");
		return false;
	}
}

