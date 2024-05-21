package java2Blog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//find the number occurring odd number of times in an array (only one element is repeated odd times)

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {10,10,20,30,20,30,20};
		
		//int result = 10^10;
		
		System.out.println("Element which is rotated odd number of times  "+getOddTimesRepeatedElements(input));
		
		System.out.println("Element which is rotated odd number of times (using XOR)  "+getOddTimesRepeatedElementsXOR(input));

	}
	
	static int getOddTimesRepeatedElementsXOR(int [] arr) {
		
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			result^=arr[i];
		}
		
		return result;
	}
	
	static int getOddTimesRepeatedElements(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int elem = 0;
		
		for(int i=0; i<arr.length; i++) {
			elem = arr[i];
			if(map.get(elem) == null) {
				map.put(elem, 1);
			}else {
				map.put(elem, map.get(elem) + 1);
			}
		}
		
		for(Entry<Integer, Integer> ent : map.entrySet()) {
			if(ent.getValue()%2 ==1) {
				return ent.getKey();
			}
			
			//System.out.println("Element " + ent.getKey() + " is repeated "+ ent.getValue() +" times. ");
		}
		return -1;
	}

}
