package java2Blog;

public class Program08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find length of array without using any inbuilt method
		
		String input = "crocodile";
		int len  = 0;
		
		try {
			while(true) {
				input.charAt(len);
				len++;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
