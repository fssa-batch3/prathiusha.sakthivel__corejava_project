package day08.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployeeCount {
	  private EmployeeCount employeeCount;

	    @Before
	    public void setUp() {
	        employeeCount = new EmployeeCount();
	    }

	    @Test
	    public void testValidInput() {
	        String input = "Hr,Ramesh\nFinance,Praveen\nHr,Arjun\nIT,Ashwin\nFinance,Surya\n";
	        InputStream in = new ByteArrayInputStream(input.getBytes());
	        System.setIn(in);

	        Map<String, List<String>> expected = new HashMap<>();
	        expected.put("Hr", Arrays.asList("Ramesh", "Arjun"));
	        expected.put("Finance", Arrays.asList("Praveen", "Surya"));
	        expected.put("IT", Collections.singletonList("Ashwin"));

	        EmployeeCount.main(new String[0]);

	    }

	    @Test
	    public void testEmptyInput() {
	    	try {
	        String input = "\n";
	        InputStream in = new ByteArrayInputStream(input.getBytes());
	        System.setIn(in);

	        EmployeeCount.main(new String[0]);
	    	}
	    	catch(IllegalArgumentException ex) {
	    		Assertions.assertEquals("Input can't be Empty or Null",ex.getMessage());
	    	}
	    }

	    @SuppressWarnings("null")
		@Test
	    public void testNullInput() {
	    	try {
	        String input = null;
	        InputStream in = new ByteArrayInputStream(input.getBytes());
	        System.setIn(in);

	        EmployeeCount.main(new String[0]);
	    	}
	    	catch(IllegalArgumentException ex) {
	    		Assertions.assertEquals("Input can't be Empty or Null",ex.getMessage());
	    	}
	    }

	    @Test
	    public void testInvalidInput() {
	    	try {
	        String input = "Hr,Ramesh,ExtraField\n";
	        InputStream in = new ByteArrayInputStream(input.getBytes());
	        System.setIn(in);

	        EmployeeCount.main(new String[0]);
	    	}
	    	catch(IllegalArgumentException ex) {
	    		Assertions.assertEquals("Input must have department and employee name",ex.getMessage());
	    	}
	    }
}
