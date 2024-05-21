package java2Blog;

//Write java Program to Find Smallest and Largest Element in an Array.

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] in = {10,8,2,20,16,19,2};
		
		int max = in[0];
		int min = in[0];
		
		for(int i=1; i<in.length; i++) {
			if(in[i] >max) {
				max = in[i];
			}
			
			if(in[i]<min) {
				min = in[i];
			}
		}
		
		System.out.println("Maximun number is "+max);
		System.out.println("Minimum number is "+min);
	}

}
