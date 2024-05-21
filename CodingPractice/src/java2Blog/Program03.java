package java2Blog;

public class Program03 {

	//check whether all the characters in a string is unique
	//solve using array of 26 chars
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "sdfgdfgsdg";
		
		char[] temp = new char[input.length()];
		
		int index = -1;
		boolean flag = false;
		
		for(int i=0; i<temp.length; i++) {
			if(!isElementPresent(temp,i-1,input.charAt(i))) {
				temp[++index] = input.charAt(i);
			}else {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("All characters are not unique");
		}else {
			System.out.println("All characters are unique");
		}
		
		
	}
	
	public static boolean isElementPresent(char[] arr, int index, char val) {
		for(int i=0; i<=index; i++) {
			if(arr[i] == val) {
				return true;
			}
		}
		return false;
	}

	
}
