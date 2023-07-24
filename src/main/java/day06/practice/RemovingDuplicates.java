package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemovingDuplicates {
	
	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<>();
		
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		try {

			List<String> newList = RemovingDuplicatesValidator.removeDuplicates(cityList);

			System.out.println(newList);

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());
		}

	}

}
