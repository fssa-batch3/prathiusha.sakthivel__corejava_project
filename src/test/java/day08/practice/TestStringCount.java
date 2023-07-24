package day08.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringCount {

	@Test
	public void testCountWords() {
		
		String[] arrNames = { "Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider" };
		
		Assertions.assertTrue(StringCount.countWords(arrNames));

	}
	

	@Test
	public void testWithEmptyArray() {
		
		String[] arrNames = {};
		
		try {
			StringCount.countWords(arrNames);
			Assertions.fail("Test With Empty Array Method is Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("String Array cann't be Empty", ex.getMessage());
		}
		
	}

	@Test
	public void testWithNullArray() {
		
		try {
			StringCount.countWords(null);
			Assertions.fail("Test With Null Array Method is Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("String Array cann't be Null", ex.getMessage());
		}
		
     }
}
