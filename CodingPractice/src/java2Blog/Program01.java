package java2Blog;

public class Program01 {

	public static void main(String args[]) {
		
		//reverse String
		String input = "abcdefABCDEF";
		
		char[] temp = input.toCharArray();
		char[] output_char = new char[temp.length];
		
		int index = 0;
		for(int i=temp.length - 1; i>=0 ; i--) {
			output_char[index++] = temp[i];
		}
		
		String op = new String(output_char);
		
		System.out.println("Reverse of the string is "+ op);
	}
}
