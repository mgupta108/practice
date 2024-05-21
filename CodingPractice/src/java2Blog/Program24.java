package java2Blog;

//Sliding window maximum in java

public class Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = {2,6,-1,2,4,1,-6,5};   //output : 6,6,4,4,4,5
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6}; //output : 3 3 4 5 5 5 6
		
		int k =3;
		
		int len = arr.length;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<=len-k; i++) {
			max = Integer.MIN_VALUE;
			
			//find minimum for each window (i, i+k);
			for(int j=i; j<i+k; j++) {
				if(arr[j] > max) {
					max = arr[j];
				}
			}
			
			System.out.print(max+" ");
			
		}
		
	}

}
