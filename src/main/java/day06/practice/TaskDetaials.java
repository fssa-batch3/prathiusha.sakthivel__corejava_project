package day06.practice;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskDetaials {
	public String taskName;

	public int priority;

	public void Task(String taskName, int priority) {
		 taskName (taskName);
		 taskpriority (priority);
		this.taskName = taskName;
		this.priority = priority;
		
	}
	public static boolean  taskName (String taskName)throws IllegalArgumentException {
		if(taskName==null || taskName.isEmpty()) {
			throw new IllegalArgumentException("TaskName cannot be null or empty");
		}
		String nameregex = "^[a-zA-Z]{2,200}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(taskName);
		Boolean isMatch = matcher.matches();



		 if (!isMatch) {
			throw new IllegalArgumentException("The  task name should be  minimum 2 letters and maximum 200 letters");

		}
		 return true;

		
	}
	public static boolean  taskpriority(int priority)throws IllegalArgumentException {
		if(priority<=0) {
			throw new IllegalArgumentException("InValid priority");
		}
		return true;
		
	}

	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("wakeupearly", 1));
		taskList.add(new Task("Walking", 2));
		taskList.add(new Task("Office", 4));
		taskList.add(new Task("Breakfast", 3));

		for (Task task: taskList) {
			System.out.println("TaskName: " + task.getName());
			System.out.println("Taskpriority: " + task.priority);

			System.out.println();
		}
		
	}
}



