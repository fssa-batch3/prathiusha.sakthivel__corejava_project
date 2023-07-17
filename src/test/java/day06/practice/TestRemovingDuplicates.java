package day06.practice;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestRemovingDuplicates {

	@Test
	public void testRemoveDuplicatesWithDuplicates() throws Exception {

		List<String> cityList = new ArrayList<>();
		cityList.add("Chennai");
		cityList.add("Bangalore"); 
		cityList.add("Mumbai");
		cityList.add("Mumbai"); 

		List<String> expectedList = new ArrayList<>();
		expectedList.add("Chennai");
		expectedList.add("Bangalore");
		expectedList.add("Mumbai");

		List<String> actualList = RemovingDuplicatesValidator.removeDuplicates(cityList);

		assertEquals(expectedList, actualList);
	}


	@Test
	public void testRemoveDuplicatesWithNoDuplicates() {
	 try {

		List<String> cityList = new ArrayList<>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");

		RemovingDuplicatesValidator.removeDuplicates(cityList);
	 }
	 catch(IllegalArgumentException ex) {
		 Assertions.assertEquals("No duplicates found", ex.getMessage());
	 }
	}


	@Test
	public void testRemoveDuplicatesWithNull() {
		
		try {

		List<String> cityList = null;

		RemovingDuplicatesValidator.removeDuplicates(cityList);
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("City list cannot be null or empty", ex.getMessage());
		}
	}

	@Test
	public void testRemoveDuplicatesWithZeroSize()  {
		
		try {
		List<String> cityList = new ArrayList<>();
		
		RemovingDuplicatesValidator.removeDuplicates(cityList);
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("City list cannot be null or empty", ex.getMessage());
		}

	}


}
