package model;

import java.util.Random;

public class NumberGenerator {

	private int quantityNumbersToGenerate;
	private int minimunValue;
	private int maximunValue;
	
	public NumberGenerator(int quantity, int minimunValue, int maximunValue) {
		this.minimunValue = minimunValue;
		this.maximunValue = maximunValue;
		quantityNumbersToGenerate = quantity;
	}
	
	public int[] orderArray() {
		return null;
	}

	public int[] neatlyOrderArray() {
		return null;
	}

	public int[] randomArray() {
		int[] boxOfNumbers = new int[quantityNumbersToGenerate];
	
		for(int i = 0; i < quantityNumbersToGenerate; i ++) {
			Random r = new Random();
			int randomGenerated = r.nextInt(maximunValue);
			if(randomGenerated >= maximunValue - minimunValue) {
				boxOfNumbers[i] = randomGenerated;
			}
			else {
				boxOfNumbers[i] = minimunValue + randomGenerated;
			}
		}
		return boxOfNumbers;
	}

	public int[] percentageArray(double percentage) {
		return null;
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
