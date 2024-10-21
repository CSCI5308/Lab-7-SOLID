package LabExamples.SOLID.violated.ISP;

public interface Machine {

	void print(Document d);

	void fax(Document d) throws Exception;

	void scan(Document d) throws Exception;
}
