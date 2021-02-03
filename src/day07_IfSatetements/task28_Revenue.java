package day07_IfSatetements;

public class task28_Revenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price=2000, quantity=30, revenue, discount=0;
		revenue=price*quantity;
		
		if (revenue>5000) {
			discount=revenue*0.1;
			revenue=revenue-discount;
			
		}
		System.out.println("discount= "+discount);
		System.out.println("revenue= "+revenue);
	}

}
