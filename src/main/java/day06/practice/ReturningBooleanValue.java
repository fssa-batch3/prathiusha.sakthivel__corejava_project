package day06.practice;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

 class Task {

	    private String name;//private data member
		public String priority;

	    public Task(String name, int i) { // public method
	        this.name = name;
	    }

	    public String getName() { //public method
	        return name;
	    }

		public static BooleanSupplier taskName(String string) {
			return null;
		}

		public static BooleanSupplier taskpriority(int i) {
			return null;
		}
	}

	public class ReturningBooleanValue {
	    public static void main(String[] args) {
	       
	        ArrayList<Task> tasks = new ArrayList<>();
	        tasks.add(new Task("Cleaning House ", 0));
	        tasks.add(new Task("Washing Clothes ", 0));
	        tasks.add(new Task("Taking the dog for Walking ", 0));

	        boolean exists = findTaskByName("Cleaning House", tasks); 
	        System.out.println("Task Status : " + exists);
	    }

	    public static  boolean findTaskByName(String name, ArrayList<Task> tasks) {
	        for (Task task : tasks) {
	            if (task.getName().equals(name)) {
	                return true; 
	            }
	        }
	        return false;
	    }
	}



