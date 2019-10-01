package coding.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchExample {

	public static void main(String[] args) {
		// Search a given integer from the list of integers using binary search
		
		int arr[] = {2,4,6,5,8,9};
		
		Arrays.sort(arr);
		System.out.println(arr);
		// Step 1. sort the array in ascending or descending order
		//We will sort the array into decending order and try to search the integer
		System.out.println("Index of key is : " + search(0, arr.length-1, arr, 6));
		
		// Step 2. divide the array till size greater than 1 -- divide and check rule
		
		
	}
	
	public static int search(int start, int end, int sortedArr [], int key) {
		if(start == end) {
			if(sortedArr[start] == key ) {
				return key;
			}
		}else {
			int mid = (start + end)/2;
			if(sortedArr[mid]== key) {
				return mid;
			}else if(sortedArr[mid] > key){
				end = mid;
				mid = (start + end)/2;
				int index = search(start, end, sortedArr, key);
				return index;
			} else if(sortedArr[mid] < key) {
				start = mid;
				mid = (start + end)/2;
				int index = search(start, end, sortedArr, key);
				return index;
			}
			
		}
		
		return 0;
	}
}
