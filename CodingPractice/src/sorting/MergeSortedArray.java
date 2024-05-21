package sorting;

public class MergeSortedArray {
	
	public static void main(String args[]) {
		
		int[] arr = {65,25,12,22,11};
		
		int[] input1 = {2,8,10,14};
		int[] input2 = {1,3,17,18,20};
		
		int[] output = mergeSortedArray(input1, input2);
		
		Operations.printArray(output);
	}
	
	
	public static int[] mergeSortedArray(int[] input1, int[] input2) {
		
		int len1 = input1.length;
		int len2 = input2.length;
		
		int newLength = len1+len2;
		
		int[] mergeArray = new int[newLength];
		
		int curr_index1 = 0;
		int curr_index2 = 0;
		int top_index = 0;
		
		while((curr_index1 < len1) && (curr_index2 <len2)) {
			if(input1[curr_index1] < input2[curr_index2]) {
				mergeArray[top_index] = input1[curr_index1];
				top_index++;
				curr_index1++;
			}else {
				mergeArray[top_index] = input2[curr_index2];
				top_index++;
				curr_index2++;
			}
			
		}
			//Operations.printArray(mergeArray);
			
			//if some elements are left out, copy that in the new merge array
			if(curr_index1 < len1) {
				while(curr_index1 < len1) {
					mergeArray[top_index] = input1[curr_index1];
					top_index++;
					curr_index1++;
				}
			}else {
				while(curr_index2 < len2) {
					mergeArray[top_index] = input2[curr_index2];
					top_index++;
					curr_index2++;
				}
			}
		
		return mergeArray;
	}

}
