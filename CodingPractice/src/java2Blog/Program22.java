package java2Blog;

//Given an array containing zeroes, ones and twos only. Write a function to sort the given array in O(n) time complexity.

public class Program22 {

	public static void main(String args[]) {
		
		int arr[] = {1, 2, 2, 0, 0, 1, 2, 2, 1};
		//arrangeOneTwoThreeUsingCountingSort(arr);
		
		//sort(arr);
		
		arrangeUsingDutchFlag(arr);
		
		//print after arranging
		printArray(arr);
		
	}
	
	static void arrangeUsingDutchFlag(int[] input) {
		
		int len = input.length;
		
		int low=0, mid=0, high=len-1;
		
		int temp=0;
		
		while(mid<=high) {
			switch(input[mid]) {
				case 0 : temp = input[low];
						input[low] = input[mid];
						input[mid] = temp;
						low++;
						mid++;
						break;
						
				case 1 : mid++;
						break;
						
				case 2 : temp = input[high];
						input[high] = input[mid];
						input[mid] = temp;
						high--;
						break;
			}
		}
	}
	
	static void arrangeOneTwoThreeUsingCountingSort(int[] input) {
		
		int countZero=0;
		int countOne=0;
		int countTwo=0;
		
		int len = input.length;
		
		for(int i=0; i<len; i++) {
			if(input[i] == 0) {
				countZero++;
			}else if(input[i] == 1) {
				countOne++;
			}else if(input[i] == 2) {
				countTwo++;
			}
		}
		
		System.out.println("Count Zero "+countZero);
		System.out.println("Count One "+countOne);
		System.out.println("Count Two "+countTwo);
		
		int currentIndex = 0;
		
		//fill with zero
		for(int j=0; j<countZero; j++) {
			input[currentIndex++] = 0;
		}
		
		//fill with one
		for(int j=0; j<countOne; j++) {
			input[currentIndex++] = 1;
		}
		
		//fill with Two
		for(int j=0; j< countTwo; j++) {
			input[currentIndex++] = 2;
		}
		
	}

	/*Function to sort the given array*/
    public static void sort(int[]a)
    {
        /* array to keep the count of 0s, 1s, 2s*/
        int[]freq = new int[3];
 
        /* traverse the given array for filling the
         * frequency array*/
        for(int val : a)
        {
            freq[val]++;
        }
        /*pointer to traverse the given array again*/
        int pointer = 0;
        for(int i=0;i<freq.length;i++)
        {
            /* loop to exhaust the number of 0s, 1s, 2s*/
            while(freq[i]-->0) //i-->0 it means compare the value of i and then decrement it.
            {
                /*at the current pointer plot the current number*/ 
                a[pointer]=i;
                /*increment the pointer*/
                pointer++;
            }
        }
    }
	
	static void printArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
