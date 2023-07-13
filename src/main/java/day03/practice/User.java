package day03.practice;

class UserDetails{
	
	private String name;
	
	private String password;
	
	private String emailId;
	
	public UserDetails() {
		
	}
	
	public UserDetails(String name,String password,String emailId ) {
		this.name=name;
		
		this.password=password;
		
		this.emailId=emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}

public class User {
	public static void main(String[] args) {
		
		UserDetails user=new UserDetails();
		user.setName("Prathiusha");
		user.setPassword("Prathiusha@22");
		user.setEmailId("Prathiusha@gmail.com");
		
		System.out.println("Name: "+user.getName());
		System.out.println("Password: "+user.getPassword());
		System.out.println("EmailId: "+user.getEmailId());
		
	}
	

}
