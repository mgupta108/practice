package java2Blog;

public class PracticeTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		
		int[] in  = {13,2,0,0,0,1,13,0,14,26};
		
		int[] op = {10,20,30,1,0,0};
		
		
		//printing array before arranging
		printArray(in);
		
		int len = in.length;
		int left = 0;
		int right = len-1;
		int temp=0;
		
		while(left<right) {
			
			while(in[left] !=0) {
				left++;
			}
			
			while(in[right] ==0) {
				right--;
			}
			
			if(left<right) {
				temp = in[left];
				in[left] = in[right];
				in[right] = temp;
			}
		}
		
		printArray(in);
		
	}
	
	static void printArray(int [] in) {
		for(int i=0; i<in.length; i++) {
			System.out.print(in[i] + " ");
		}
		
		System.out.println();
	}

}
