//Insertion Sort By Uzair Hasan
//This made this from scratch then improved it with comparing it to other's online
public class BinarySearch {
	public static void main(String[] args) {
		int A[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int B = 4;
		boolean C = binarySearch(A, B, 0, A.length-1);
		System.out.println(C);
	}

	public static boolean binarySearch(int A[], int B, int C, int D) {
		if (/*B > D ||*/ C > D) {
			return false;
		}
		int E = (C + D) / 2;
		if (A[E] == B) {
			return true;
		} else if (A[E] > B) {
			return binarySearch(A, B, C, E - 1);
		} else if (A[E] < B) {
			return binarySearch(A, B, E+1, D);
		}
		return false;
	}
}
//Any questions, feel free to email me and ask!
//uzairhasan12@hotmail.com
