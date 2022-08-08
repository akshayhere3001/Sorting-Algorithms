import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
		// Implementation
		
		int arr[] = {8, 6, 7, 5, 4, 1, 3, 2};
		
		// Time-Complexity - O(n^2)
		
		for(int i = 0; i<arr.length; i++) {
			// declare smallest variable first 
			int smallest = i;
			
			for(int j = i + 1; j<arr.length; j++) {
				
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			// swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		
		
		// Printing the Array
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
    
    
	}
}
