package LabExamples.SOLID.violated.OCP;

import java.util.List;

public class OCPMain {

	public static void main(String[] args) {
	    Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
	    Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
	    Product house = new Product("House", Color.BLUE, Size.LARGE);

	    List<Product> products = List.of(apple, tree, house);

	    ProductFilter pf = new ProductFilter();
	    System.out.println("Green products (old):");
	    pf.filterByColor(products, Color.GREEN)
	      .forEach(p -> System.out.println(" - " + p.name + " is green"));

	  }
}
