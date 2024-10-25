package LabExamples.SOLID.solved.DIP;

public class BackEndDeveloper implements Developer{

	public void writeNodejs() {
		System.out.println("Nodejs code");
    }

	@Override
	public void develop() {
		writeNodejs();
		
	}
}
