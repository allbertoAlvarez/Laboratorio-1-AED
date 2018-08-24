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

	public static void main(String[] args) {
		Test t = new Test(50, 1, 50);
		for (int a : t.generator.percentageRandomNumbers(50)) {
			System.out.print(a + " ");
		}

	}

}
