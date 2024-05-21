package java2Blog;

//Find local minima in array

public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 5, 3, 6, 13, 16, 7};
		
		getLocalMinima(arr);
	}

	static void getLocalMinima(int[] input) {
		
		int len = input.length;
		
		if(len == 1) {
			System.out.println(input[0]);
		}else {
			 if(input[0] < input[1]) {   //check if first element is local minima
					System.out.println(input[0]);
			    }
			 if(input[len-1] < input[len-2]) {   //check if last element is local minima
					System.out.println(input[len-1]);
				}
			 
			 //check for all the mid elements
			for(int i=1; i<len-1; i++) {
				if((input[i] < input[i-1]) && (input[i] < input[i+1])) {
					System.out.println(input[i]);
				}
			}
		}
	}
}
