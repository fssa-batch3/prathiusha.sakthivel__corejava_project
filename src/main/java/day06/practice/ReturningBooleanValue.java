package day06.practice;

import java.util.ArrayList;

 class Task {

	    private String name;

	    public Task(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	}

	public class ReturningBooleanValue {
	    public static void main(String[] args) {
	       
	        ArrayList<Task> tasks = new ArrayList<>();
	        tasks.add(new Task("Cleaning House"));
	        tasks.add(new Task("Washing Clothes"));
	        tasks.add(new Task("Taking the dog for Walking"));

	        boolean exists = findTaskByName("Cleaning House", tasks); 
	        System.out.println("Task Status : " + exists);
	    }

	    public static  boolean findTaskByName(String name, ArrayList<Task> tasks) {
	        for (Task task : tasks) {
	            if (task.getName().equals(name)) {
	                return true; // This line return the method
	            }
	        }
	        return false;
	    }
	}



