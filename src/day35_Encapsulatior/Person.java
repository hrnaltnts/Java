package day35_Encapsulatior;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	//SOURCE -> GENERATE -> GETTER AND SETTER
	
	
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
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	

}


//   Encapsualtion
//  - private
//  - public setter method
//  - public getter method