package day06.practice;

import java.util.ArrayList;

public class TaskDetaials {
	
	    public String taskName;
	    public int priority;

	    public TaskDetaials(String taskName, int priority) {
	        this.taskName = taskName;
	        this.priority = priority;
	    }

	    public static void main(String[] args) {
	    	
	        ArrayList<TaskDetaials> tasks = new ArrayList<>();

	        tasks.add(new TaskDetaials("Cleaning House", 60));
	        tasks.add(new TaskDetaials("Washing Clothes", 30));
	        tasks.add(new TaskDetaials("Taking the dog for Walking", 10));
	        
	        for (TaskDetaials task : tasks) {
	            System.out.println("Task : " + task.taskName);
	            System.out.println("Priority for the Task : " + task.priority);
	            System.out.println();
	        }
	        
	   }
}



