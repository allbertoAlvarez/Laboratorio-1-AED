package model;

public class SortNumbers {
	

	public static final String insertionSortTemporalComplexity = "O(n^2)";
	public static final String insertionSortSpaceComplexity = "O(1)";
	public static final String heapSortTemporalComplexity = "O(n*Log n)";
	public static final String heapSortSpaceComplexity = "O(1)";
	public static final String mergeSortTemporalComplexity = "O(n*Log n)";
	public static final String mergeSortSpaceComplexity = "O(n)";
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
	
	public void merge(int arr[], int l, int m, int r) {
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;

		/* create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/*
		 * Copy data to temp arrays L[] and R[]
		 */
		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];

		/*
		 * Merge the temp arrays back into arr[l..r]
		 */
		i = 0;
		j = 0;
		k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/*
		 * Copy the remaining elements of L[], if there are any
		 */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/*
		 * Copy the remaining elements of R[], if there are any
		 */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Iterative HeapSort.
		// Source: https://www.javagists.com/heapsort
		public int[] heapSort(int[] array) {
			// Creating heap
			int middle = array.length / 2 - 1;
			for (int i = middle; i >= 0; i--) {
				int leftChild = array[i * 2 + 1];
				// If there is not right child it will be equal to left child
				int rightChildren = array[i * 2 + (i * 2 + 2 < array.length ? 2 : 1)];
				// "Sift" current element if it is less than one of its children
				if (array[i] < Math.max(leftChild, rightChildren)) {
					array = sift(i, array, array.length);
				}
			}
			// Sorting array
			// Right bound of unsorted part of array
			int rightBound = array.length;
			while (rightBound > 0) {
				// Changing positions of the first and the last elements
				array = swap(0, rightBound - 1, array);
				rightBound--;
				// Sifting new first element considering decremented right bound
				array = sift(0, array, rightBound);
			}
			return array;
		}
	
		public int[] sift(int index, int[] array, int rightBound) {
			// Iterate while element has at least one child
			while (index * 2 + 1 < rightBound) {
				int leftChild = array[index * 2 + 1];
				int rightChild = array[index * 2 + (index * 2 + 2 < rightBound ? 2 : 1)];
				// If left child is bigger than left and current element we need to
				// swap current with left child and go to the next iteration
				if (leftChild >= rightChild && leftChild > array[index]) {
					array = swap(index, index * 2 + 1, array);
					index = index * 2 + 1;
					continue;
				}
				// If right child is greater than current - swap and go to the next
				if (rightChild > array[index]) {
					array = swap(index, index * 2 + 2, array);
					index = index * 2 + 2;
					continue;
				}
				// Since we got here, current element is bigger than it children, so we
				// don't need to iterate more
				break;
			}
			return array;
		}
		
		// Change positions of two elements with indicies i1 and i2 in array
		public int[] swap(int i1, int i2, int[] array) {
			int temp = array[i1];
			array[i1] = array[i2];
			array[i2] = temp;
			return array;
		}

}
