package day09.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIntegerSort {
	ArrayList<Integer> intList = new ArrayList<Integer>();
	
	@Test
	public void testValidInput() {
		Assertions.assertTrue(IntegerSort.addIntegerToArray(intList));
	}
	
	@Test
	public void testInvalidNullInput() {
		
		try {
			IntegerSort.addIntegerToArray(null);
			Assertions.fail("Test Invalid Null Input Mathod Has been Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("ArrayList Can't be Null", ex.getMessage());
		}
		
	}
}
