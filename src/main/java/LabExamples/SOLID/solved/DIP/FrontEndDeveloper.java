package LabExamples.SOLID.solved.DIP;

public class FrontEndDeveloper implements Developer {
	public void writeJavascript() {
		System.out.println("Javascript code");
	}

	@Override
	public void develop() {
		writeJavascript();
	}
}
