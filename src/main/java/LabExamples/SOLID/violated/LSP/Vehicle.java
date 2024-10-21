package LabExamples.SOLID.violated.LSP;

public abstract class Vehicle {
protected boolean isEngineRunning;
	
	public Vehicle()
	{
		isEngineRunning = false;
	}
	
	public abstract void startEngine();
	public abstract void stopEngine();
	
	public void move()
	{
		if (isEngineRunning)
		{
			startEngine();
			System.out.println("Vehicle is moving!");
			stopEngine();
		}
	}
}
