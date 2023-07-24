package day11.misc;

import java.util.ArrayList;
import java.util.Objects;

public class CustomException {
	public static ArrayList<User> arr = new ArrayList<>();

	public static void main(String[] args) throws InvalidUserException {
		User user1 = new User(1, "pranaw");
		User user2 = new User(1, "pranaw");

		insertUser(user1);
		insertUser(user2);
		System.out.println("completed");
		System.out.println(arr);
	}

	public static void insertUser(User user) throws InvalidUserException {
		if (arr.contains(user)) {
			throw new InvalidUserException("User already irukaan da lawade poda anga..");
		}
		arr.add(user);
	}

}

class User {
	int id;
	String name;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User otherUser = (User) obj;
		return this.id == otherUser.id && this.name.equals(otherUser.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}

class InvalidUserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidUserException(String msg) {
		super(msg);
	}

	public InvalidUserException(Throwable te) {
		super(te);
	}

	public InvalidUserException(String msg, Throwable te) {
		super(msg, te);
	}

}