//Insertion Sort By Uzair Hasan
//This made this from scratch
public class LinearSearchAlgorithm {
	public static void main (String[] args) {
		int A[] = {0,1,2,3,4,5,6,7,8}; //Random test array
		int B = 4; //Random search value
		int C = linearSearch(arr,B);
	}
	
	public static int linearSearch(int A[], int B) {
		for(int i = 0; i<A.length;i++) { //Loop through all values in the array
			if(A[i] == B) { //Check if the value at the current index is equal to the number we are looking for
				return i; ///If equal, return index value
			}
		}
		return -1; //Return -1 (which can never be an index) if no match was found
	}
}
//Any questions, feel free to email me and ask!
//uzairhasan12@hotmail.com
