package java2Blog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program05 {
	
	//solve using 26 chars array

	//find duplicate characters in a string
	public static void main(String[] args) {
		
		//Method1 : using index
		find_dupes("aaManisshabb");
		
		
		//Method2 : Using sorted Array
		find_dupes_sorted("aaManisssshabb");
		
		
		//Method3 : Using Collection
		find_dupes_collection("aaManisssshabb");
	}
	
	//Method1
	private static void find_dupes(String str1) {
		
		char[] dupes = new char[str1.length()];
		int index = -1;
				
		
		for(int i=0; i<str1.length(); i++) {
			int firstIndex = str1.indexOf(str1.charAt(i));
			int lastIndex = str1.lastIndexOf(str1.charAt(i));
			
			if(firstIndex != lastIndex) {
				if(!Program03.isElementPresent(dupes, index, str1.charAt(i))) {
					dupes[++index] = str1.charAt(i);
				}
			}
		}
		
		//printing duplicate elements
		if(index == -1) {
			System.out.println("No duplicate Elements found");
		}else {
			System.out.print("Duplicate Elements are : [ ");
			for(int i=0;i<=index; i++) {
				System.out.print(dupes[i] + " ");
			}
			System.out.print("]");
		}
		
	}

	//Method2
	private static void find_dupes_sorted(String str1) {
		
		char[] char_array = str1.toCharArray();
		Arrays.sort(char_array);
		
		char[] dupes = new char[str1.length()];
		int index = -1;
		
		for(int i=0; i<str1.length()-1; i++) {
			if(str1.charAt(i) == str1.charAt(i+1)) {
				if(!Program03.isElementPresent(dupes, index, str1.charAt(i))) {
					dupes[++index] = str1.charAt(i);
				}
			}
		}
		
		//printing duplicate elements
		if(index == -1) {
			System.out.println("No duplicate Elements found");
		}else {
			System.out.print("Duplicate Elements are : [ ");
			for(int i=0;i<=index; i++) {
				System.out.print(dupes[i] + " ");
			}
			System.out.print("]");
		}
	}

	//Method3
	private static void find_dupes_collection(String str1) {
		
		List<Character> dupe_list = new ArrayList<Character>();
		List<Character> unique_list = new ArrayList<Character>();
		
		for(int i=0; i<str1.length(); i++) {
			if(unique_list.contains(str1.charAt(i))) {
				if(!dupe_list.contains(str1.charAt(i))) {
					dupe_list.add(str1.charAt(i));
				}
			}else {
				unique_list.add(str1.charAt(i));
			}
		}
		
		if(dupe_list.isEmpty()) {
			System.out.println("No duplicate Elements");
		}else {
			System.out.println("Printing duplicate elements");
			Iterator<Character> it = dupe_list.iterator();
			while(it.hasNext()) {
				System.out.print(it.next() + "");
			}
			
		}
		
		
		
//		map.put('a', 0);
//		map.put('b', 1);
//		map.put('c', 1);
//		map.put('d', 1);
//		map.put('e', 1);
//		
//		System.out.println("value for a is "+map.get('z'));
//		
//		Set<Entry<Character, Integer>> set1 = map.entrySet();
//		
//		for(Entry<Character, Integer> en : set1) {
//			System.out.println("Key is "+en.getKey() +" value is "+en.getValue());
//		}
		
	}
}
