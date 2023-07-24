package day03.practice;

class Employee {
	 
	    private int id;//private data member
	    private String name;//private data member
	    
	    public Employee(int id, String name) {//constructor to access the attribute
	        this.id = id;
	        this.name = name;
	        System.out.println("id="+this.id+", "+"name="+this.name);
	    }
}

public class TestEmployee {
	public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");
      
    }

}
