package LabExamples.SOLID.violated.ISP;

public class MultiFunctionPrinter implements Machine {

	@Override
	public void print(Document d) {
		System.out.println("Print the text from the document: " + d);

	}

	@Override
	public void fax(Document d) throws Exception {
		System.out.println("Fax the text from the document: " + d);

	}

	@Override
	public void scan(Document d) throws Exception {
		System.out.println("Scan the text from the document: " + d);

	}

}
