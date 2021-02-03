package day17_UserfInput;

public class BmwObjects {

	public static void main(String[] args) {
		
		bmw b1=new bmw();
		bmw b2=new bmw();
		
		
		System.out.println(b1.make); //BMW
			System.out.println(b2.make); //BMW
		
		b1.make= "BMW 2020";		
		
		System.out.println(b1.make); //BMW 2020
		
		System.out.println(b2.make); // BMW
		
		System.out.println(b1.model); //null
		
		b1.model="m3";
		b1.showPrice();  //Price:65000.0
		
	//	b2.showPrice();
		
		//Exception in thread "main" java.lang.NullPointerException
	    //at first/day17_UserfInput.bmw.showPrice(bmw.java:11)
	    //at first/day17_UserfInput.BmwObjects.main(BmwObjects.java:24)
		
		b2.model="X3";
		b2.showPrice();
		//X3is not available
		//Price:0.0

	

	}

}
