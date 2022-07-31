
public class InsertionSort {
	public static void InsertionSort(int arr[]) {
		
		// temporary variables
		int temp;
		int j;
		
		// starting with 1th index and checking all left side of an array
		for(int i =1; i<arr.length; i++) {
			temp = arr[i];
			j = i - 1;  // for iterating over left side of an array
			
			while(j>=0 && temp<arr[j]) {
				arr[j+1] = arr[j];
				j = j -1;
			}
			arr[j + 1] = temp;
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {23, 3, 1, 4, 5, 2};
		InsertionSort(arr);
		
		for(int k = 0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
