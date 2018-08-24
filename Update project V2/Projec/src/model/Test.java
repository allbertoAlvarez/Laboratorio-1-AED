package model;

public class Test {

	public static final double MS_FOR_SECOND = 1000;
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

	public double getSecondsForInsertionSort(int a[]) {
		
		long start = System.currentTimeMillis();
		
		sort.insertionSort(a);
		
		long completeDurationMiliSeconds = System.currentTimeMillis() - start;
		double completeDurationSeconds = completeDurationMiliSeconds / MS_FOR_SECOND;
		
		return completeDurationSeconds;
		
	}
	
	public double getSecondsForMergeSort(int a[]) {
		
		long start = System.currentTimeMillis();
		
//		sort.mergeSort(a);
		
		long completeDurationMiliSeconds = System.currentTimeMillis() - start;
		double completeDurationSeconds = completeDurationMiliSeconds / MS_FOR_SECOND;
		
		return completeDurationSeconds;	
	}
	
	public double getSecondsForHeapSort(int a[]) {
		
		long start = System.currentTimeMillis();
		
		sort.heapSort(a);
		
		long completeDurationMiliSeconds = System.currentTimeMillis() - start;
		double completeDurationSeconds = completeDurationMiliSeconds / MS_FOR_SECOND;
		
		return completeDurationSeconds;
		
	}
	
	
	
	
	
	
	
	

	
}
