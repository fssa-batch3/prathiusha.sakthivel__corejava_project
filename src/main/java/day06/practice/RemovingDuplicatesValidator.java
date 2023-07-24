package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemovingDuplicatesValidator {
	
	public static List<String> removeDuplicates(List<String> cityList) throws IllegalArgumentException {

		if (cityList == null || cityList.size() == 0) {

			throw new IllegalArgumentException("City list cannot be null or empty");
		}


		ArrayList<String> newList = new ArrayList<String>();

		for (String element : cityList) {

			if (!newList.contains(element)) {

				newList.add(element);
			}
		}


		if (newList.size() == cityList.size()) {

			throw new IllegalArgumentException("No duplicates found");
		}

		return newList;

	}


}
