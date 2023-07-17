package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, List<String>> departmentEmployees = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter input like :Hr,Name");
			String str = scan.nextLine();
			if (str == null || "".equals(str)) {

				throw new IllegalArgumentException("Input can't be Empty or Null");
			}

			String[] arrstr = str.split(",");

			if (arrstr.length < 2 || arrstr.length > 2) {
				throw new IllegalArgumentException("Input must have department and employee name");
			}

			if (departmentEmployees.get(arrstr[0]) == null) {
				departmentEmployees.put(arrstr[0], new ArrayList<>());
				departmentEmployees.get(arrstr[0]).add(arrstr[1]);
			} else {
				departmentEmployees.get(arrstr[0]).add(arrstr[1]);
			}

		}
		System.out.println(departmentEmployees);
		scan.close();

	}

	public Object getDepartmentEmployees() {
		return null;
	}

}
