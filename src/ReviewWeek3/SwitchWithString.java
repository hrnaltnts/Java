package ReviewWeek3;

public class SwitchWithString {

	public static void main(String[] args) {
		
		//String equality
//		String str1="Adam ;";
//		String str2="Adam ;";
		
		//checking the content of str1 and str2 equal or not
		//!!!!!!//we use equals method//!!!!!!//
//		boolean isSame=str1.equals(str2);
		
//		System.out.println(isSame);
//		String season="Summer";
//		if(season.equals("Spring")){//= if(season=="Spring")
//			System.out.println("picnic!!");
//		
//	   }else if (season.equals("Summer")) {
//			System.out.println("Swimming");
			
//		}else if (season.equals("Fall") ){
//			System.out.println("Hiking");
			
//		}else if (season.equals("Winter") ){
//			System.out.println("Snowboarding!");
		String season="Summerr";
		switch(season) {
		
		case "Sipring":
			System.out.println("Picnic");
		break;
		
		case "Summer":
			System.out.println("Swimming");
		break;
		
		case "Fall":
			System.out.println("Hiking");
		break;
		case "Winter":
			System.out.println("Sking");
		break;
		default:
			System.out.println("invalid entry");
				
		
		}
		
		}
	
	}


