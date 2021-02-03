package assigment3_aritmaticOperators;

public class Question7_vendingMachne {

	public static void main(String[] args) {
	int quarters, dimes, nickels,change, price=95;
	change=100-price;
	quarters = change/25;
	change = change %25;

    dimes = change/10;
    change = change %10;

    nickels = change/5;
    
	System.out.println("Price in cents:"+price);
	System.out.println("Your charge is "+quarters+"quartes "+dimes+"dimes "+nickels+"nickle ");
	}
}
