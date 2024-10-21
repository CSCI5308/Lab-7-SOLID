package LabExamples.SOLID.violated.ISP;

public class OldFashionedPrinter implements Machine {

	@Override
	public void print(Document d) {
		System.out.println("Print the text from the document: " + d);

	}

	@Override
	public void fax(Document d) throws Exception {
		throw new Exception();

	}

	@Override
	public void scan(Document d) throws Exception {
		throw new Exception();

	}

}
