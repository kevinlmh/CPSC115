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
	
	/* public int[] selectionSort(int[] list) {
		int[] sorted = list;
		int unsorted_index = 0;
		int min_index;
		//go throught list length times and find the lowest number
		for (int i=0; i<sorted.length; i++) {
			for (int j=0; j<sorted.length; j++) {
				int min = sorted[];
				
			}
			
		}
	} */
		
}//end of Sort