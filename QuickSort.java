public class QuickSort {
	public static int Partition(int arr[], int low, int high) {
		
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j<high; j++) {
			
			if(arr[j] < pivot) {
				i++;
				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
		
	}
	
	
	public static void Pointer(int arr[], int low, int high) {
		
		if(low < high) {
			int pivotIndex = Partition(arr, low, high);
			
			Pointer(arr, low, pivotIndex - 1);
			Pointer(arr, pivotIndex + 1, high);
		}
		
	}
	
  
	public static void main(String[] args) {
		
		int arr[] = {9, 4, 2, 6, 8, 1, 3};
		int len = arr.length;
		
		Pointer(arr, 0, len - 1);
		
		// Printing an Array
		for(int i = 0; i<len; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
