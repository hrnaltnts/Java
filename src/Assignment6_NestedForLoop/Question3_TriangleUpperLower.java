package Assignment6_NestedForLoop;

public class Question3_TriangleUpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int rows=7;
		
		upper:
		for(int i =1; i<=rows; i++) {                   
			                                            
			if(i==rows) break upper;                    
			                                            
			for(int j=1; j<=i; j++) {                   
				System.out.print(" ");                  
				}                                       
				                                        
			for(int z=i; z<=rows; z++) {                
				                                        
				System.out.print(+z+" ");               
				                                        
			}                                           
			System.out.println();
			
		}
			lower:
			for(int i =rows; i>=1; i--) {
				
				for(int j=i; j>=1; j--) {
					System.out.print(" ");
					}
					
				for(int z=i; z<=rows; z++) {
					System.out.print(+z+" ");
					
				}
				System.out.println();
		}
		

	}

}
                        
     //1 2 3 4 5 6 7    
     // 2 3 4 5 6 7     
     //  3 4 5 6 7      
     //   4 5 6 7       
     //    5 6 7        
     //     6 7         
     //      7          
     //     6 7         
     //    5 6 7        
     //   4 5 6 7       
     //  3 4 5 6 7      
     // 2 3 4 5 6 7     
     //1 2 3 4 5 6 7    
                        