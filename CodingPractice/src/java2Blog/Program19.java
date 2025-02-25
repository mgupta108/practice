package java2Blog;

import java.util.Arrays;

//Find all pairs of elements from an array whose sum is equal to given number

public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenNum = 15;
		int array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
		
		getAllPairwithSumEqualsToGivenNumber(array, givenNum);

	}
	
static void getAllPairwithSumEqualsToGivenNumber(int[] array, int num) {
		
		Arrays.sort(array);
		
		int len = array.length;
		int sum = 0;
		
		int l=0, r = len-1;
		
		while(l<r) {
			
			sum = array[l] + array[r];
			
			if(sum == num) {
				System.out.println("Pair of numbers with sum equals to "+ num +" : ("+array[l] + ", "+array[r] + ")");
				r--;
				l++;
			}else if(sum>num) {
				r--;
			}else {
				l++;
			}
		}
		
		
	}
	


}
