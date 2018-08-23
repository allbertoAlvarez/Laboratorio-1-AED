package model;

public class SortNumbers {
	
	private boolean heapSort;
	private boolean insertionSort;
	private boolean mergeSort;
	
	public SortNumbers() {
	}
	
	public boolean isHeapSort() {
		return heapSort;
	}

	public void setHeapSort(boolean heapSort) {
		this.heapSort = heapSort;
	}


	public boolean isInsertionSort() {
		return insertionSort;
	}


	public void setInsertionSort(boolean insertionSort) {
		this.insertionSort = insertionSort;
	}


	public boolean isMergeSort() {
		return mergeSort;
	}

	public void setMergeSort(boolean mergeSort) {
		this.mergeSort = mergeSort;
	}

	public int[] heapSort() {

		int[] numbersGenerated;

		return null;
	}

	public int[] insertionSort(int[] arr) {
		
	     int n = arr.length;
	     for (int i=1; i<n; ++i) {
	          int key = arr[i];
	          int j = i-1; 
	       while (j>=0 && arr[j] > key){
	             arr[j+1] = arr[j];
	             j = j-1;
	            }
	       arr[j+1] = key;
	   }
	     
	     return arr;
	}
	
	public int[] insertionSortReverse(int[] arr) {
		
	     int n = arr.length;
	     for (int i=1; i<n; ++i) {
	          int key = arr[i];
	          int j = i-1; 
	       while (j>=0 && arr[j] < key){
	             arr[j+1] = arr[j];
	             j = j-1;
	            }
	       arr[j+1] = key;
	   }
	     
	     return arr;
	}

	public int[] mergeSort() {

		int[] numbersGenerated;

		return null;
	}

}
