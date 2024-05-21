package random;

import java.util.Arrays;

public class ConvertBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 20;
		
		//converting to binary
		int[] binary = new int[40];
		int index = 0;
		
		while(num>0) {
			
			binary[index++] = num%2;
			num = num/2;
		}
		
		for(int i = index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
		
		//System.out.println("Binary is "+bin);
	}

}
