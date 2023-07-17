package day08.practice;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class TestStringCount {

	@Test
	public void testCountWords() {
		
		String[] arrNames = { "Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider" };
		
		Map<String, Integer> count = StringCount.countWords(arrNames);

	}

	@Test
	public void testWithEmptyArray() {
		
		String[] arrNames = {};
		
		Map<String, Integer> count = StringCount.countWords(arrNames);

		try {
			count = StringCount.countWords(arrNames);
		} 
		catch (NullPointerException e) {
			// method throws a NullPointerException for null input = fails

		}
	}

	@Test
	public void testWithNullArray() {

		String[] arrNames = null;

		Map<String, Integer> countMap = StringCount.countWords(arrNames);

		if (countMap != null) {
			assertEquals(0, countMap.size());
		} else {
			assertNull(countMap);
		}
	}
}
