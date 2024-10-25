package LabExamples.SOLID.solved.LSP;

public class LSPMain {

	public static void main(String[] args) {
		Car deviceWithEngine  =  new Car();
		Bicycle deviceWithoutEngine = new Bicycle();
		
		System.out.println("-- Device with engine --");
		deviceWithEngine.move();
		System.out.println("-- Device without engine --");
		deviceWithoutEngine.move();
		

	}

}
