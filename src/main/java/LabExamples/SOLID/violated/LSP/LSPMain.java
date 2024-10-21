package LabExamples.SOLID.violated.LSP;

public class LSPMain {

	public static void main(String[] args) {
		Vehicle deviceWithEngine = new Car();
		Vehicle deviceWithoutEngine = new Bicycle();

		System.out.println("-- Device with engine --");
		deviceWithEngine.move();
		System.out.println("-- Device without engine --");
		deviceWithoutEngine.move();

	}

}
