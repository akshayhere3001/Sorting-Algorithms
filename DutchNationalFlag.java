import java.util.*;

public class DutchNationalFlag {
	// Function of Swapping
	
	public static void Swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	
	public static void main(String[] args) {

		// There are 3 Pointer in this algorithm which are 
		// low, mid and high
		// also known as 0, 1, 2's Sort
		
		int arr[] = {0, 2, 1, 1, 0, 0, 1, 2, 2};
		
		int low = 0; 
		int mid = 0;
		int high = arr.length - 1;
		
		while(mid <= high) {
			
			if(arr[mid] == 0) {
				Swap(arr, mid, low);
				
				mid++; low++;
			} 
			else if(arr[mid] == 1) {
				mid++;
			}
			else {
				Swap(arr, mid, high);
				
				high--; 
			}	
		}
		
		// Printing an Array
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
