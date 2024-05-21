package java2Blog;

// find missing number in an array
//You are given an integer array containing 1 to n but one of the number from 1 to n in the array is missing

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		
		int len = arr.length + 1;
		
		int reqdSum = len*(len+1)/2;
		
		int actualSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			actualSum += arr[i];
		}
		
		System.out.println("Missing number is "+ (reqdSum - actualSum));

	}

}
