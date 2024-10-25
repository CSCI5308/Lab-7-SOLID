package LabExamples.SOLID.solved.OCP;

public class CompareBothSpecs<T> implements Specification<Product>{

	private Specification<Product> first, second;

	  public CompareBothSpecs(Specification<Product> first, Specification<Product> second) {
	    this.first = first;
	    this.second = second;
	  }

	@Override
	public boolean isSatisfied(Product item) {
		return false;
	}

}
