package fr.richard.maven.model;

public class Student {
	
	private String username;
	private int age;
	
	public Student() {
		this("paul",15);
	}
	
	public Student(String username) {
		this(username,30);
	}

	public Student(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void displayInfo() {
		System.out.println("je suis dans SpringHello ");
		
	}

	

	@Override
	public String toString() {
		return "Student [username=" + username + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	

}
