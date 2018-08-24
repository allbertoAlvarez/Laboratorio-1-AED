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

	public int[] randomNumbers() {
		int[] boxOfNumbers = new int[quantityNumbersToGenerate];
		Random r = new Random();
		for (int i = 0; i < quantityNumbersToGenerate;) {
			int randomGenerated = r.nextInt(maximunValue) + 1;
			if (randomGenerated >= minimunValue) {
				boxOfNumbers[i] = randomGenerated;
				i++;
			}
		}
		return boxOfNumbers;
	}

	public int[] inOrdermNumbers() {
		SortNumbers sort = new SortNumbers();
		int[] boxOfNumbers = sort.mergeSort(randomNumbers(), quantityNumbersToGenerate);

		return boxOfNumbers;
	}

	public int[] percentageRandomNumbers(double percentage) {

		int percentageQuantity = (int) Math.ceil(((percentage / 100) * quantityNumbersToGenerate));
		int[] boxOfNumbers = inOrdermNumbers();

		int pivot = 0;
		int aux = 0;

		for (int i = percentageQuantity; i > 1; i--) {
			pivot = (int) (Math.random() * percentageQuantity);

			aux = boxOfNumbers[pivot];
			boxOfNumbers[pivot] = boxOfNumbers[i];
			boxOfNumbers[i] = aux;
		}

		return boxOfNumbers;
	}

	public int[] randomNumbersInReverseOrder() {

		SortNumbers sort = new SortNumbers();
		int[] boxOfNumbers = sort.insertionSortReverse(randomNumbers());

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
