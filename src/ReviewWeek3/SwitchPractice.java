package ReviewWeek3;

public class SwitchPractice {

	public static void main(String[] args) {
		
		int seasonCode=90 ; //
		
		//1:Spring 2:Summer 3:Fall 4:Winter
		switch(seasonCode) {
		case 1:
			System.out.println("Spring");
			break;
		case 2:
			System.out.println("Summer");
			break;
		case 3:
			System.out.println("Fall");
			break;
		case 4:
			System.out.println("Winter");
			break;
			default:
				System.out.println("in valid entry");
			
		}

	}

}
