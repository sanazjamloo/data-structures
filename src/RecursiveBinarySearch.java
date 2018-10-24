//Recursive approach

//Assuming that the array is sorted.

public class RecursiveBinarySearch {
	
	public static int binarySearchRecursive (int key, int[] array, int start, int end) {
		
		int middle = (start + end)/2;
		
		if(end < start){
			 return -1;
		} 
		
		if (key < array[middle]){
			return binarySearchRecursive(key, array, start, middle - 1);
		}
		
		if (key > array[middle]){
			return binarySearchRecursive(key, array, middle + 1, end);
		}
		
		if (key == array[middle]){
			return middle;
		}
		
		return -1;
	}
}
