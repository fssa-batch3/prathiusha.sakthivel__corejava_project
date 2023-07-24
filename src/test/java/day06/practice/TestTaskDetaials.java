package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTaskDetaials {
	// We check the input task name is valid 
		@Test
		public void testvalid() {
			Assertions.assertTrue(TaskDetaials.taskName("wakeupearly"));
		}
		
//		we check the input task is invalid
		@Test
		public void testInvalid() {
			try {
				TaskDetaials.taskName("t");
				Assertions.fail("Validate failed");
			} catch (IllegalArgumentException ex) {
				Assertions.assertEquals("The task name should be minimum 2 letters and maximum 100 letters", ex.getMessage());
			}
			
		}
		
		@Test
		public void testInvail1() {
//			we check the input empty or null 
			try {
				TaskDetaials.taskName(null);
				Assertions.fail("Validate failed");
			}
			catch(IllegalArgumentException e) {
				Assertions.assertEquals("TaskName cannot be null or empty", e.getMessage());
				
			}
		}
		
//		Test a task priority
		@Test
		public void testpriority() {

			Assertions.assertTrue(TaskDetaials.taskpriority(1));

		}

//		Test a task invalid priority
		
		@Test
		public void testInValidpriority() {

			try {
				TaskDetaials.taskpriority(0);
				Assertions.fail("Validate failed");
			} catch (IllegalArgumentException e) {
				Assertions.assertEquals("InValid priority", e.getMessage());
			}

		

		}
		

}
