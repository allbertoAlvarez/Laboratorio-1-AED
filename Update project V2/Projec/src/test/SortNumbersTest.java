package test;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.SortNumbers;

class SortNumbersTest extends TestCase {

	private SortNumbers sort;

	private void setupStage1() {
		sort = new SortNumbers();
	}

	@Test
	void insertionSort() {
		setupStage1();

		int[] list = new int[10];

		for (int i = list.length - 1, j = 0; i > 0 && j < list.length; i--, j++) {
			list[j] = i;
		}

		int[] list_a = sort.insertionSort(list);

		for (int i = 0; i < list_a.length; i++) {
			assertTrue(list_a[i] == i);
		}

	}

	@Test
	void insertionReverse() {
		setupStage1();

		int[] list = new int[10];

		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}

		int[] list_a = sort.insertionSortReverse(list);

		for (int i = list_a.length - 1, j = 0; i > 0 && j < list_a.length; i--, j++) {
			assertTrue(list_a[j] == i);
		}
	}
	
	@Test
	void mergeSortTest() {
		
		setupStage1();
		int[] list = new int[10];
		
		for (int i = list.length - 1, j = 0; i > 0 && j < list.length; i--, j++) {
			list[j] = i;
		}
		
		int[] list_a = sort.mergeSort(list, list.length);
		
		for (int i = 0; i < list_a.length; i++) {
			assertTrue(list_a[i] == i);
		}	
	}
	
	@Test
	void heapSortTest() {
		
		setupStage1();
		int[] list = new int[10];
		
		for (int i = list.length - 1, j = 0; i > 0 && j < list.length; i--, j++) {
			list[j] = i;
		}
		
		int[] list_a = sort.heapSort(list);
		
		for (int i = 0; i < list_a.length; i++) {
			assertTrue(list_a[i] == i);
		}
	}

}
