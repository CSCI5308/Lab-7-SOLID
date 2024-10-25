package LabExamples.SOLID.solved.LSP;

public abstract class DeviceWithEngine extends Vehicle{

protected boolean isEngineRunning;
	
	public DeviceWithEngine()
	{
		isEngineRunning = false;
	}
	
	public abstract void startEngine();
	public abstract void stopEngine();
	
	public void move()
	{
		startEngine();
		if (isEngineRunning)
		{
			System.out.println("Vehicle is moving!");
		}
		stopEngine();
	}
	
}
