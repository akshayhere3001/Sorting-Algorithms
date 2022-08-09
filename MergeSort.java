public class MergeSort {
	public static void conquer(int arr[], int start, int mid, int end) {
		int mergedArray[] = new int[end - start + 1];
		
		int index1 = start;
		int index2 = mid + 1;
		int x = 0;
		
		while(index1 <= mid && index2 <= end) {
			
			if(arr[index1] <= arr[index2]) {
				mergedArray[x] = arr[index1];
				x++; index1++;
			}
			else {
				mergedArray[x] = arr[index2];
				x++; index2++;
			}
		}
		
		while(index1 <= mid) {
			mergedArray[x] = arr[index1];
			x++; index1++;
		}
		
		while(index2 <= end) {
			mergedArray[x] = arr[index2];
			x++; index2++;
		}
		
		for(int i = 0, j = start; i<mergedArray.length; i++, j++) {
			arr[j] = mergedArray[i];
		}
		
		
	}
	
	
	
	public static void divide(int arr[], int start, int end) {
		
		if(start >= end) {
			return;
		}
		
		
		int mid = start + (end - start)/2;
		
		divide(arr, start, mid);
		divide(arr, mid + 1, end);
		
		conquer(arr, start, mid, end);
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {5, 8, 6, 1, 3, 4, 9, 7, 2};
		int len = arr.length;
		
		
		divide(arr, 0, len-1);
		
		// Printing the Array 
		for(int i = 0; i<len; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
