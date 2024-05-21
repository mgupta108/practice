package sorting;

public class ReverseString {
	
	public static void main(String args[]) {
		
		String input = "abc-1";
		
		//input = "", expected o/p = "";
		//input = a, expect o/p = a;
		//input = abc, expected o/p = "cba"
		
		//with non alphabets
		// i/p ="1111*^*&^" o/p = 1111*^*&^
		// i/p = "abc-def~12" o/p = fed-bca~12
		// i/p ="1abcsdfhk-jkl3" o/p = 1lkjkhfds-abc3
		// i/p = "abc-1d"     o/p = "dcb-1a"
		
//		char[] temp1 = input.toCharArray();
//		
//		for(int i=0;i<temp1.length;i++) {
//			System.out.println(temp1[i]);
//		}
//		System.out.println("Test String is "+String.valueOf(temp1));
//		
		int start = 0;
		int end = input.length()-1;
		
		
		while(start!=end) {
			
			char left = input.charAt(start);
			char right = input.charAt(end);
			if(Character.isAlphabetic(input.charAt(start)) && Character.isAlphabetic(input.charAt(end))) {
				//swap the characters
				
				char[] temp = input.toCharArray();
				
				temp[start] = right;
				temp[end] = left;
				
				input = String.valueOf(temp);
				
				start++;
				end--;
				
			}else if(!Character.isAlphabetic(start)) {
				
				//increase the left index by 1
				start++;
			} else {
				end--;
			}
			
		}
		
		System.out.println("New form of string is "+input);
				
	}

}
