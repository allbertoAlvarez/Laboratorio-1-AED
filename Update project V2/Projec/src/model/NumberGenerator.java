package model;

import java.util.Random;

public class NumberGenerator {

	private int quantityNumbersToGenerate;
	private int minimunValue;
	private int maximunValue;
	private SortNumbers sort;
	
	public NumberGenerator(int quantity, int minimunValue, int maximunValue) {
		this.minimunValue = minimunValue;
		this.maximunValue = maximunValue;
		quantityNumbersToGenerate = quantity;
		sort = new SortNumbers();
	}
	
	public int[] neatlyOrderArray() {
		return null;
	}

	public int[] randomNumbers() {
		int[] boxOfNumbers = new int[quantityNumbersToGenerate];
	
		for(int i = 0; i < quantityNumbersToGenerate; i ++) {
			Random r = new Random();
			int randomGenerated = r.nextInt(maximunValue) + 1;
			if(randomGenerated >= maximunValue - minimunValue) {
				boxOfNumbers[i] = randomGenerated;
			}
			else {
				boxOfNumbers[i] = minimunValue + randomGenerated;
			}
		}
		return boxOfNumbers;
	}

	public int[] percentageRandomNumbers(double percentage) {
		
		int percentageQuantity = (int) Math.ceil(((percentage / 100) * quantityNumbersToGenerate));
		int half = Math.floorDiv(quantityNumbersToGenerate, 2);
		int[] partialBoxRight = new int[half];
		int[] partialBoxLeft = new int[half];
		int[] completeBoxNumbers = new int[quantityNumbersToGenerate];
		
		//Parte izquierda
		for(int i = 0; i < partialBoxLeft.length ; i ++) {
			Random r = new Random();
			int randomGenerated = r.nextInt(maximunValue) + 1;
			if(randomGenerated >= maximunValue - minimunValue) {
				partialBoxLeft[i] = randomGenerated;
			}
			else {
				partialBoxLeft[i] = minimunValue + randomGenerated;
			}
		}
		partialBoxLeft = sort.insertionSort(partialBoxLeft);
		
		//Parte derecha
		for(int i = 0; i < partialBoxRight.length; i ++) {
			Random r = new Random();
			int randomGenerated = r.nextInt(maximunValue) + 1;
			if(randomGenerated >= maximunValue - minimunValue) {
				partialBoxRight[i] = randomGenerated;
			}
			else {
				partialBoxRight[i] = minimunValue + randomGenerated;
			}
		}
		
		//Union de las partes
		for(int i = 0; i < quantityNumbersToGenerate ; i ++) {
			if(i < half) {
				completeBoxNumbers[i] = partialBoxLeft[i];
			}
			else {
				completeBoxNumbers[i] = partialBoxRight[i - half];
			}
		}
		
		return completeBoxNumbers;
	}
	
	public int[] randomNumbersInOrder() {
		
		int[] boxOfNumbers = new int[quantityNumbersToGenerate];
		
		for(int i = 0; i < quantityNumbersToGenerate; i ++) {
			Random r = new Random();
			int randomGenerated = r.nextInt(maximunValue) + 1;
			if(randomGenerated >= maximunValue - minimunValue) {
				boxOfNumbers[i] = randomGenerated;
			}
			else {
				boxOfNumbers[i] = minimunValue + randomGenerated;
			}
		}
		boxOfNumbers = sort.insertionSort(boxOfNumbers);
		
		return boxOfNumbers;
	}
	
	public int[] randomNumbersInReverseOrder() {
		
		int[] boxOfNumbers = new int[quantityNumbersToGenerate];
		
		for(int i = 0; i < quantityNumbersToGenerate; i ++) {
			Random r = new Random();
			int randomGenerated = r.nextInt(maximunValue) + 1;
			if(randomGenerated >= maximunValue - minimunValue) {
				boxOfNumbers[i] = randomGenerated;
			}
			else {
				boxOfNumbers[i] = minimunValue + randomGenerated;
			}
		}
		boxOfNumbers = sort.insertionSortReverse(boxOfNumbers);
		
		return boxOfNumbers;
		
		
	}
	
	
	public int getQuantityNumbersToGenerate() {
		return quantityNumbersToGenerate;
	}

	public int getMinimunValue() {
		return minimunValue;
	}

	public void setMinimunValue(int minimunValue) {
		this.minimunValue = minimunValue;
	}

	public int getMaximunValue() {
		return maximunValue;
	}

	public void setMaximunValue(int maximunValue) {
		this.maximunValue = maximunValue;
	}

	public void setQuantityNumbersToGenerate(int quantityNumbersToGenerate) {
		this.quantityNumbersToGenerate = quantityNumbersToGenerate;
	}
	
	
	
	

}
