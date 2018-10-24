/*  Binary search is a search algorithm that finds the position of a target value within
 *  a sorted array. Binary search compares the target value to the middle element of the
 *  array; if they are unequal, the half in which the target cannot lie is eliminated and
 *   the search continues on the remaining half until it is successful.
 */

//Iterative approach

public class BinarySearch {
	
	int size;   //size of the array
	int [] array;  // name of the array

	public boolean binarySearch (int key) {
		//low is the beginning of the remaining list, 
		//and i give it an initial value of 0.
		int low = 0;
		
		//high is the end of the remaining list, 
		//and i give it an initial value of the last thing in the list.
		int high = size -1;
		
		//keep going until low is bigger than or equal to high.
		while (high >= low) {
			
			//calculate the middle so we can divide the list into two pieces.
			int middle = (low + high) /2; 
			if (array[middle] == key) {
				return true;
			} if (array[middle] < key) {
				low = middle + 1;
			} if (array[middle] > key) {
				high = middle - 1;
			}
		}
		return false;
	}
}
