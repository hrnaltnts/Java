package day37_Inheritance;

public class Employee extends Person {
	
	
	String Jobtitle;
	
	
	public void work()
	{
		System.out.println(name+" is working as "+Jobtitle);
	}


	@Override
	public String toString() {
		return "Employee [Jobtitle=" + Jobtitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
