
public class LinearSearchAlgorithm {
	public static void main (String[] args) {
		int arr [] = {0,1,2,3,4,5,6,7,8};
		int here=linearSearch(arr,4);
		System.out.println(here);
	}
	
	public static int linearSearch(int arra[], int thiss) {
		for(int i = 0; i<arra.length;i++) {
			if(arra[i]==thiss) {
				return i;
			}
		}
		return -1;
	}
}
