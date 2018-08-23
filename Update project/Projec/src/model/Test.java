package model;

public class Test {

	private NumberGenerator generator;
	private SortNumbers sort;

	public Test(int quantityToGenerate, int minimumValue, int maximumValue) {
		generator = new NumberGenerator(quantityToGenerate, minimumValue, maximumValue);
		sort = new SortNumbers();
	}

	public NumberGenerator getGenerator() {
		return generator;
	}

	public void setGenerator(NumberGenerator generator) {
		this.generator = generator;
	}

	public SortNumbers getSort() {
		return sort;
	}

	public void setSort(SortNumbers sort) {
		this.sort = sort;
	}
	
	public int getMaximumValue() {
		return generator.getMaximunValue();
	}
	
	public int getMinimumValue() {
		return generator.getMinimunValue();
	}
	
	public int getQuantityOfNumbersToGenerate() {
		return generator.getQuantityNumbersToGenerate();
	}

	
	
	
	

	
}
