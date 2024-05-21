package java2Blog;

public class CharCountConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input: ABCDAB
		//Output: A:1 B :1C:1 D:1 A:1 B:1
		
		//AABBAABB
		//A:2B2A2B2
		
		String in = "AAAABBCDABBB";
		
		//getConsecutiveMethod1(in);
		
		getConsecutiveMethod2(in);
		
	}
	
	static void getConsecutiveMethod2(String in) {
		
		int count=1;
		
		for(int i=0; i<in.length()-1; i++) {
			
			count=1;
			
			if((in.charAt(i) == in.charAt(i+1)) && (i<in.length()-1)) {
				count++;
				i++;
			}
			
			System.out.print(in.charAt(i)+""+count);
		}
	}
	
	static void getConsecutiveMethod1(String in) {
		
		in = in+"x";
		int left = 0;
		int right = in.length() -1; 
		
		char prev = in.charAt(0);
		int index = 1;
		int count = 1;
		
		do {
			
			if(in.charAt(index) == in.charAt(index-1)) {
				count++;
			} else {
				System.out.print(in.charAt(index-1) + ""+count);
				count = 1;
				prev = in.charAt(index-1);
			}
			
			left++;
			index++;
			
		}while(left != right);
	}

}