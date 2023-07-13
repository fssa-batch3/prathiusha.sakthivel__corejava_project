package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemovingDuplicates {
	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<String>();
		
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		List<String> duplicateCity = new ArrayList<String>();

  
        for (String cityname : cityList) {
           
            if (!duplicateCity.contains(cityname)) {
            	duplicateCity.add(cityname);
            }
        }
        
        for (String city : duplicateCity) {
            System.out.println(city);
        }
	}

}
