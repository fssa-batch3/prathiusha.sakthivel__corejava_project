package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Task {

	private int id;
	private String name;
	private LocalDate deadline;

	public Task(int id, String name, LocalDate deadline2) {
		this.id = id;
		this.name = name;
		this.deadline = deadline2;
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
}

class NameComparator implements Comparator<Task> {
	public int compare(Task t1, Task t2) {
		return t1.getName().compareTo(t2.getName());
	}
}

public class TaskOrderSort {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Task> tasks = new ArrayList<>();
		System.out.println("Enter the number of tasks:");

		int n = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Task " + (i + 1) + " details (id, name, deadline in yyyy-MM-dd format):");
			int id = scanner.nextInt();
			scanner.nextLine();
			String name = scanner.nextLine();
			LocalDate deadline = LocalDate.parse(scanner.nextLine());
			tasks.add(new Task(id, name, deadline));
		}
		Collections.sort(tasks, new NameComparator());
		System.out.println("Tasks in sorted order by name:");
		for (Task task : tasks) {
			System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
		}
	}

}
