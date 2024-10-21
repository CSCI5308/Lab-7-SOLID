package LabExamples.SOLID.violated.LSP;

public class Car extends Vehicle{

	@Override
	public void startEngine() {
		isEngineRunning = true;
		System.out.println("Starting the engine.");
		
	}

	@Override
	public void stopEngine() {
		isEngineRunning = false;
		System.out.println("Engine stopped!");
	}

}
