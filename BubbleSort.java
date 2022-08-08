import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		
		
		// Implementations
		int arr[] = {7,6, 8, 5, 4, 1, 3, 2};
		
		for(int i = 0; i<arr.length - 1; i++) {   // Iterate over an Array except last One 
			for(int j = 0; j<arr.length - i - 1; j++) {
				
				if(arr[j] > arr[j + 1]) {
					// swap 
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
			}
		}
		
		// Printing the Array
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
