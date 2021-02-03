package day40_AccessModifiers_Final_Hiding;

public class FinalVariables {
	
	//public final int ROAD_MAX_RANGE; error
	public final int ROAD_MAX_RANGE=500;
	public final int MODEL_3_MAXSPEED;  // if next class name("Final Error") is not same ERROR 
	public final int MODEL_x_PASSENGERS; // if next class name("Final Error") is not same ERROR 
	public static final String ADMIN_USERNAME; // Where this variable will be initialized? STATIC
	
		
	public FinalVariables() {
		MODEL_3_MAXSPEED=200;
		//ADMIN_USERNAME="HARUN"; // WHY ERROR?? BECAUSE IT SHOULD INITIALIZE ON  STATIC BLOCK NOT INSTANCE BLOCK
		
		}
	
		{ //INSTANCE BLOCK 	
			MODEL_x_PASSENGERS=0;
		//ADMIN_USERNAME="HARUN"; // WHY ERROR?? BECAUSE IT SHOULD INITIALIZE ON STATIC BLOCK NOT INSTANCE BLOCK
		
		}
		
		static { //STATIC BLOCK 
			ADMIN_USERNAME="HARUN";
		}
		
	

	public static void main(String[] args) {
		
		final int MAX_PERSEENGERS_COUNT = 5;
		
		//public final int SSN; Local variable cant be public
		final int SSN;
		
		FinalVariables finalVars = new FinalVariables();
		System.out.println(finalVars.ROAD_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MAXSPEED);
		System.out.println(FinalVariables.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME);// BECAUSE SAME CLASS
		
		

	}

}
