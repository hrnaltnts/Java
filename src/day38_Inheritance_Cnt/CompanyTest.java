package day38_Inheritance_Cnt;

public class CompanyTest {
	
	public static void main(String[] args ){
	
	Employee emp = new Employee();
	FulltimeEmployee ft = new FulltimeEmployee ();
	Contractor ct = new Contractor();
	
	emp.CalculatePay(40,40);
	ft.CalculatePay(40,40);
	ct.CalculatePay(40,40);
	
	}
	

}
