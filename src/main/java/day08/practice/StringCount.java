package day08.practice;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
	public static void main(String[] args) {
		
		String[] arrNames= {"Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider"};
		
		Map<String,Integer> countMap = new HashMap<String,Integer>();
		
		for(int i=0;i<arrNames.length;i++) {
			
			String word = arrNames[i].trim().toLowerCase();
			
			if(countMap.get(word)== null) {
				countMap.put(word,1);
			}
			else {
				int count = countMap.get(word) ;
				count++;
				countMap.put(word,count);

			    
			}

		}
		System.out.println(countMap);

	}

	public static Map<String, Integer> countWords(String[] arrNames) {
		return null;
	}
}
