package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class CustomTask {
    private int id;
    private String name;
    private LocalDate deadline;
    private int priority;
    public CustomTask(int id, String name, LocalDate deadline, int priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public LocalDate getDeadline() {
        return deadline;
    }
    public int getPriority() {
        return priority;
    }
}
class TaskComparator implements Comparator<CustomTask> {
    public int compare(CustomTask t1, CustomTask t2) {
        int deadlineComparison = t1.getDeadline().compareTo(t2.getDeadline());
        if (deadlineComparison != 0) {
            return deadlineComparison;
        }
        return Integer.compare(t1.getPriority(), t2.getPriority());
    }
}
public class DeadlineAndPriority {
	 public static void main(String[] args) {
	        List<CustomTask> tasks = new ArrayList<>();
	        Scanner scan= new Scanner(System.in);
	        System.out.println("Enter the number of tasks:");
	        int n = scan.nextInt();
	        scan.nextLine();
	        int count = 0;
	        while (count < n) {
	            System.out.println("Enter the task details of " + (count + 1) + " as id, name, priority, deadline (in yyyy-MM-dd format):");
	            int id = scan.nextInt();
	            scan.nextLine();
	            String name = scan.nextLine();
	            LocalDate deadline = LocalDate.parse(scan.nextLine());
	            int priority = scan.nextInt();
	            tasks.add(new CustomTask(id, name, deadline, priority));
	            count++;
	        }
	        Collections.sort(tasks, new TaskComparator());
	        for (CustomTask task : tasks) {
	            System.out.println(task.getId() + "," + task.getName() + "," + task.getPriority() + "," + task.getDeadline());
	        }
	        scan.close();
	    }
}
