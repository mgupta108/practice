package java2Blog;

import java.util.Arrays;

// find a Pair Whose Sum is Closest to given number in Array

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]={-40,-5,1,3,6,7,8,20};
		
		int givenNumber = 5;
		
		getSumClosedToZero(array, givenNumber);
		
	}
	
	static void getSumClosedToZero(int[] array, int num) {
		
		Arrays.sort(array);
		
		int len = array.length;
		int sum = 0;
		int absSum = Integer.MAX_VALUE;
		
		int l=0, r = len-1;
		int left_index = -1, right_index = -1;
		
		while(l<r) {
			
			sum = array[l] + array[r] - num;
			
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
	

}
