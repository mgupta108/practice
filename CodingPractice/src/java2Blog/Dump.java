package java2Blog;

public class Dump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{ 1, 2 },{ 4, 5 },{ 7, 8 }};
		
		int a[] = {1,2,3};
		
		int len1 = arr.length;
        int len2 = arr[0].length;
        
        System.out.println("len1 "+len1+" len2 "+len2);
        
        for(int i=0; i<len1; i++){
            for(int j=0; j<len2; j++){
                System.out.println(arr[i][j]);
            }
        }

	}

}
