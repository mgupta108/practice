package sorting;

public class SelectionSort {

	
	/*The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
	 *  from unsorted part and putting it at the beginning.
	 *   The algorithm maintains two subarrays in a given array.
		1) The subarray which is already sorted. 
		2) Remaining subarray which is unsorted.
		In every iteration of selection sort, the minimum element (considering ascending order)
		 from the unsorted subarray is picked and moved to the sorted subarray. 
 
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {65,25,12,22,11};
		int min = 999999;
		int temp=0;
		int minIndex = -1;
		
		for(int i=0; i<arr.length-1; i++) {
			
			min = arr[i];
			for(int j =i+1;j<arr.length; j++ ) {
				if(min>arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
//			System.out.println("For iteration "+i);
//			printArray(arr);
			
			//swap elements
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		Operations.printArray(arr);
	}
	

}
