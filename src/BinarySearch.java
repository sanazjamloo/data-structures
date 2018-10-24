
public class BinarySearch {
	
	int size;   //size of the array
	int [] data;  // name of the array

	public boolean binarySearch (int key) {
		//low is the variable that tells us where the beginning of the remaining list is, 
		//and i give it an initial value of 0.
		int low = 0;
		//high is the variable that tells us where the end of the remaining list is, 
		//and i give it an initial value of the last thing in the list.
		int high = size -1;
		
		//keep going until low is bigger than or equal to high.
		while (high >= low) {
			
			//calculate the middle so we can divide the list into two pieces.
			int middle = (low + high) /2; 
			if (data[middle] == key) {
				return true;
			} if (data[middle] < key) {
				low = middle + 1;
			} if (data[middle] > key) {
				high = middle - 1;
			}
		}
		return false;
	}
}
