package ReviewWeek3;

import java.util.Scanner;

public class LoginTestWithScanner {

	public static void main(String[] args) {
		
		//shortcut  for importing after below line
		//ctrl+shidt+o
		
		Scanner input = new Scanner(System.in);
		
		  System.out.println("Username: ");
		  String username= input.next();
		  System.out.println("Password: ");
	      String password= input.next();
	      
	      // correct username password is abcd and secret
	      
	      /**
	       * If the username and password is abcd and secret at the same time
	       * print LOGIN SUCCESSFUL
	       *  else
	       * print LOGIN NOT SUCCESSFUL
	       * optionally add logic for what was not correct
	       */
	      
//	      if(username.equals("abcd") && password.equals("secret") ) {
//	    	  System.out.println("LOGIC SUCCESSFUL!!!");
//	      }else {
///	    	  System.out.println("LOGIN NOT SUCCESFULL!!");
//	      }
	      /**
	       * 1.both username and password are correct
	       * 2.both username and password are wrong
	       * 3. username is correct but password is wrong
	       * 4. username is wrong but password is correct
	       */
	      if (username.equals("abcd")&& password.equals("secret") ) {
	    	  System.out.println("Login Successful!");
	    	 
	      } else if (!username.equals("abcd")&& !password.equals("secret") ) {
	    	  
	    	  System.out.println("BOTH USERNAME AND PASSWORD ARE WRONG!!");
	      }else if (username.equals("abcd") && !password.equals("secret") ) {
	    	  System.out.println("USER NAME IS CORRECT BUT PASSWORD IS WRONG");
	      }
		
		

	}

}
