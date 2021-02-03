package Encapsulation;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>100) {
			System.out.println("Yanlis age oldu o");
		}else {
		this.age = age;
		}
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	

}
