package java2Blog;

import java.util.Arrays;

// find a Pair Whose Sum is Closest to zero in Array

public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]={1,3,-5,7,8,20,-40};
		
		getSumClosedToZero_BruteForce(array);
		
		getSumClosedToZero(array);
		
		findPairWithMinSum_copiedFromWebsite(array);
	}
	
	static void getSumClosedToZero(int[] array) {
		
		Arrays.sort(array);
		
		int len = array.length;
		int sum = 0;
		int absSum = Integer.MAX_VALUE;
		
		int l=0, r = len-1;
		int left_index = -1, right_index = -1;
		
		while(l<r) {
			
			sum = array[l] + array[r];
			
			if(Math.abs(sum) < absSum) {
				absSum = Math.abs(sum);
				//absSum = sum;
				left_index = l;
				right_index = r;
			}
			
			if(sum>0) {
				r--;
			}else {
				l++;
			}
		}
		
		System.out.println("Pair of numbers for sum closest to zero : ("+array[left_index] + ", "+array[right_index] + ")");
	}
	
	static void getSumClosedToZero_BruteForce(int[] array) {
		int sum = 0;
		int absSum = Integer.MAX_VALUE;
		int num1 = 0, num2 = 0;
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				sum = array[i] + array[j];
				//System.out.println("Sum is "+sum);
				
				if(Math.abs(sum) < absSum) {
					absSum = Math.abs(sum);
					num1 = array[i];
					num2 = array[j];
				}
			}
		}
		
		System.out.println("Pair of numbers for sum closest to zero : ("+num1 + ", "+num2 + ")");

	}

	
	public static void findPairWithMinSum_copiedFromWebsite(int arr[]) {
		 
        // Sort the array, you can use any sorting algorithm to sort it
        Arrays.sort(arr);
        int sum=0; 
        int minimumSum = Integer.MAX_VALUE;
        int n=arr.length;
        if(n<0)
            return;
        // left and right index variables
        int l = 0, r = n-1;
 
        // variables to keep track of the left and right index pair for minimumSum
        int minLeft = l, minRight = n-1;
 
        while(l < r)
        {
            sum = arr[l] + arr[r];
 
            /*If abs(sum) is less than min sum, we need to update sum and pair */
            if(Math.abs(sum) < Math.abs(minimumSum))
            {
                minimumSum = sum;
                minLeft = l;
                minRight = r;
            }
            if(sum < 0)
                l++;
            else
                r--;
        }
 
        System.out.println(" The pair whose sum is minimun : "+arr[minLeft]+" "+ arr[minRight]);
    }
 
}
