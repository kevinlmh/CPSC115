// 
//  Sorting Algorithms
//	Including Bubble Sort, Selection Sort and Merge Sort
//  
//  Created by Kevin Liu on 2013-11-29.
//  Copyright 2013 Kevin Liu. All rights reserved.
// 

public class Sort {
	public int[] bubbleSort(int[] list) {
		int temp;
		int[] sorted = list;
		//go through the list length times
		for (int i=0; i<sorted.length; i++) {
			//compare elements and rearrange
			for (int j=0; j<sorted.length-1; j++) {
				//if element is bigger than next element, swap
				if (sorted[j] > sorted[j+1]) {
					temp = sorted[j];
					sorted[j] = sorted[j+1];
					sorted[j+1] = temp;
				}//end of if			
			}// end of j loop			
		}//end of i loop
		return sorted;
	}//end of bubbleSort
	
	 public int[] selectionSort(int[] list) {
		int[] sorted = list;
		int unsorted_start_index;
		//go throught list length times and find the lowest number
		for (int i=0; i<sorted.length-1; i++) {
			int min = sorted[unsorted_start_index];
			int min_index = 0;
			for (int j=0; j<sorted.length; j++) {
				if (sorted[j] < min) {
					min = sorted[j];	//store smallest value
					min_index = j;		//store index if min value
				}//end of if
			}//end of j
			
			//swap current smallest and current first unsorted element
			sorted[min_index] = sorted[unsorted_start_index];
			sorted[unsorted_start_index] = min;
			//increment unsorted start point index 
			unsorted_start_index++;
		}//end of i
		return sorted;
	}//end of selectionSort



/* ************************* HAHA *************************** */
//dashen zuo si

	//check if array is unsorted
	public boolean checkUnsorted(int[] array) {
		boolean isUnsorted = false;
		for (int i=0; i<array.length-1; i++) {
			if (array[i] > array[i+1]) {
				isUnsorted = true;
			}//end of if			
		}
		return isUnsorted;
	}
	
	public int[] dashen(int[] list) {
		int temp;
		int[] sorted = list;
		
		checkUnsorted(list);
		
		while (checkUnsorted(list)) {
			for (int j=0; j<sorted.length-1; j++) {
			//if element is bigger than next element, swap
			if (sorted[j] > sorted[j+1]) {
				temp = sorted[j];
				sorted[j] = sorted[j+1];
				sorted[j+1] = temp;
			}//end of if			
			}// end of j loop	
		}//end of while
		return sorted;
	}//end of optimizedBubbleSort
	
}//end of Sort
