package LabExamples.SOLID.violated.SRP;

public class SRPMain {
	public static void main(String[] args) throws Exception {
		Journal j = new Journal();
		j.addEntry("Welcome to CSCI 5308");
		j.addEntry("Let's study the SOLID principles!");
		System.out.println(j);

		String filename = "journal.txt";
		j.save(filename);
	}
}
