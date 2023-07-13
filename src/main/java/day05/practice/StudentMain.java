package day05.practice;

public class StudentMain {

	public static void main(String[] args) {
		
		Department stuDept = new Department("Mechanical engineering", 22);
		
		Student student = new Student("Prathiusha", 22, stuDept);
		
		System.out.println(student);
	}

}
class Student {
	
	String name;
	int id;
	Department department;
	
	public Student(String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student's [Name=" + name + ", Id=" + id + ", Department=" + department.getDetails() + "]";
	}
	
	
	
	
}


class Department {
	String deptName;
	int deptId;
	
	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}
	
	public String getDetails() {
		return (this.deptName + "\n" + "Department Id: " + this.deptId );
	}
	
}