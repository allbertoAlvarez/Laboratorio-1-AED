package model;

public class Test {

	private NumberGenerator generator;
	private SortNumbers sort;

	public Test() {
		
	}

	public void addQuantityToGenerate(int a) {
		generator = new NumberGenerator(a);
	}
	
}
