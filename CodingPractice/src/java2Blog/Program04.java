package java2Blog;

public class Program04 {

	//check whether a string is rotation of other
	//https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
	
	public static void main(String[] args) {
		
		String str1 = "name";
		String str2 = "amne";
		
		System.out.println("Is string \""+str1+"\" rotation of \""+str2 + "\" ? : "+isRotation(str1, str2));
	}
	
	private static boolean isRotation(String str1, String str2) {
		
		String temp = str1;
		
		for(int i=0; i<str1.length(); i++) {
			temp = temp.substring(1, str1.length()) + temp.charAt(0);
			
			if(temp.equals(str2)) {
				return true;
			}
		}
		return false;
	}

}
