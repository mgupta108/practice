package sorting;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,3,5,8,11};
		int searchNum = 12;
		
		System.out.println("Is element present ? :"+ binarySearch(arr, 0, arr.length -1 , searchNum));

	}
	
	public static int binarySearch(int[] in, int begin, int end, int elem) {
		
		if(end >= begin) {
			
			int mid = begin + (end-begin)/2;
			
			if(in[mid] == elem) {
				return mid;
			} else if(in[mid] > elem) {
				 return binarySearch(in, begin, mid-1, elem);
			} else {
				return binarySearch(in, mid+1, end, elem);
			}
		}
		
		return -1;
	}

}
