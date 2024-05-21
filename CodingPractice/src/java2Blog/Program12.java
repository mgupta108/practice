package java2Blog;

//Search an element in rotated and sorted array.

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={16,19,21,25,3,5,8,10};
		
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
				break;
			}
		}
		
		System.out.println("Minimum element is "+min);


	}

}
