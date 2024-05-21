package java2Blog;

//find second highest element in an array

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {6, 7,7};
		int secondHighest = getSecondHighest(input);
		
		System.out.println("Second highest element is "+secondHighest);

	}
	
	private static int getSecondHighest(int[] arr) {
		
		if(arr.length == 1) {
			return arr[0];
		}else {
			int highest = Integer.MIN_VALUE;
			int secondHighest = highest;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>highest) {
					secondHighest = highest;
					highest = arr[i];
				}else if((arr[i] >secondHighest) && (arr[i] != highest)) { //second condition helps in case of duplicate elements
					secondHighest = arr[i];
				}
			}
			
			return secondHighest;
		}
		
	}

}
