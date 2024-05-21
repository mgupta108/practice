package random;

/*
 26             Z
 51             AY
 52             AZ
 80             CB
 676            YZ
 702            ZZ
 705            AAC*/

public class ConvertNumToExcelColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1, 26, 51, 52, 80, 676, 702, 705};
		
		for(int i : input) {
			convertToExcelColumn(i);
		}
	}
	
	public static void convertToExcelColumn(int num) {
		char binary[] = new char[40];
		int index = 0;
		
		while(num >0) {
			
			binary[index++] = (char)(65+ (num-1)%26);
			num = (num-1)/26;
		}
		
		for(int i = index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
		
		System.out.print("\t");
		
	}

}
