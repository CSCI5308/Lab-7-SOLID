package LabExamples.SOLID.solved.LSP;

public class Car extends DeviceWithEngine{

	@Override
	public void startEngine() {
		System.out.println("Starting the engine.");
		isEngineRunning = true;
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Engine stopped!");
		isEngineRunning = false;
	}

}
