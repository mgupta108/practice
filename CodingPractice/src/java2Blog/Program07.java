package java2Blog;


public class Program07 {

	//find all substring of a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abcd";
		for(int i =0; i<input.length(); i++) {
			for(int j=0; j<input.length()-i; j++) {
				
				int newVal = j+i+1;
				System.out.println(input.substring(j,newVal));
			}
		}
		
		
		
//		String a = "string";
//		String b = new String("string");
//		String c = a;
//		
//		System.out.println(a == b);
//		System.out.println(a == c);
//		System.out.println(b.equals(c));
	}
}