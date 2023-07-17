package day08.misc;

import java.util.HashMap;
import java.util.Map;

public class NameCountUsingHashMap {
	public static void main(String[] args) {
		String[] arrNames= {"Prathiusha","Megha","Swetha","Prathiusha","Swetha","Prathiusha"};
		Map<String,Integer> countMap = new HashMap<String,Integer>();
		
		
		for(int i=0;i<arrNames.length;i++) {
			if(countMap.get(arrNames[i])==null) {
				countMap.put(arrNames[i],1);
			}
			else {
				int count = countMap.get(arrNames[i]);
				count++;
				countMap.put(arrNames[i],count);

			    
			}

		}
		System.out.println(countMap);

	}

}
