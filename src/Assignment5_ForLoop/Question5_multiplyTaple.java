package Assignment5_ForLoop;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question5_multiplyTaple {
	public static String lameDb(String db, String op,String id,String data)
	  {
		
	    String[] lameDbArray=db.split("#");
	    String result="";
	    if(op.equals("add")){
	    	result=db+"#"+id+""+data;
	    	
	    }if(op.equals("edit")) {
	    	for(String each :lameDbArray) {
	    		if(each.contains(id)) {
	    			each=each.replace(each.substring(1), data);
	    		}
	    	}
	    	result=Arrays.toString(lameDbArray);
	    }if(op.equals("delete")) {
	    	for(String each :lameDbArray) {
	    		if(each.contains(id)) {
	    			
	    		}
	    	}
	    	
	    }
	    	
	      
	    
	    return result;
	  }//end lameDb
	  
	  
	   public static void main(String[] args) 
	   {
	    
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
	   }
	  
	}