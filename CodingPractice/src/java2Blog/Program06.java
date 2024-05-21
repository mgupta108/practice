package java2Blog;

import java.util.ArrayList;
import java.util.List;

public class Program06 {
	
	public static void main(String args[]) {
		
//		char[] in= {'M', 'M', 'a', 'n', 'i', 's', 'h', 'a', 'a'};
//		System.out.println("Is element present "+ isElementPresent(in, 1, 'M'));
		
		//Method1 : Using array search
		//getFirstNonRepated("MMaann");
		
		//Method2 : Using indexOf
		getFirstNonRepated_index("MMaanni");
		
		//Method3
	}
	
	private static void getFirstNonRepated_index(String str) {
		
		char first_nonRepeated = '\u0000';
		int firstIndex = -1;
		int lastIndex = -1;
		for(int i=0; i<str.length(); i++) {
			firstIndex = str.indexOf(str.charAt(i));
			lastIndex = str.lastIndexOf(str.charAt(i));
			
			if(firstIndex == lastIndex) {
				first_nonRepeated = str.charAt(i);
				break;
			}
		}
		
		if(first_nonRepeated != '\u0000') {
			System.out.println("First non-repated char is "+first_nonRepeated);
		}else {
			System.out.println("There is no non-repated character in the string");
		}
	}
	
	private static void getFirstNonRepated(String str) {
		
		char[] _char = str.toCharArray();
		char first_nonRepeated = '\u0000';
		List<Character> already_searched = new ArrayList<Character>();
		
		for(int i=0; i<str.length(); i++) {
			
			if(i != str.length()-1) {
				if(!already_searched.contains(_char[i])) {
					already_searched.add(_char[i]);
					if(!isElementPresent(_char, i+1, _char[i])) {
						first_nonRepeated = _char[i];
						break;
					}
				}
			}else {
				if((!already_searched.contains(_char[_char.length-1]))) {
					first_nonRepeated = _char[_char.length-1];
				}
			}
		}
		
		//checking whether last element is non-repeated
		
//		if(first_nonRepeated == '\u0000' && (!already_searched.contains(_char[_char.length-1]))) {
//			first_nonRepeated = _char[_char.length-1];
//		}
		
		if(first_nonRepeated != '\u0000') {
			System.out.println("First non-repated char is "+first_nonRepeated);
		}else {
			System.out.println("There is no non-repated character in the string");
		}
	}
	
	private static boolean isElementPresent(char[] input, int start_index, char val) {
		
		
		for(int i=start_index; i<input.length; i++) {
			if(input[i] == val) {
				return true;
			}
		}
		return false;
	}

}
