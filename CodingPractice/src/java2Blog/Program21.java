package java2Blog;

//Separate odd and even numbers in an array

public class Program21 {

	public static void main(String args[]) {
		
		int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
		
		System.out.println("Before separation of odd and even");
		printArray(arr);
		
		int len = arr.length;
		int l = 0;
		int r = len-1;
		
		int temp =0;
		
		while(l<r) {
			
			//traverse till we get odd in the left side
			//if we keep 'if' instead of 'while' then also it is producing correct output
			while(arr[l]%2 != 1) {	
				l++;
			}
			
			//traverse till we get even in the right side
			while(arr[r]%2 != 0) {
				r--;
			}
			
			//swap odd in the left side with even in the right side
			if(l<r) {
				temp = arr[r];
				arr[r] = arr[l];
				arr[l] = temp;
			}
			
		}
		
		System.out.println("After separation");
		printArray(arr);
	}
	
	static void printArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
