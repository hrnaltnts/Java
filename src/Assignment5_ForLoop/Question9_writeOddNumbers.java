package Assignment5_ForLoop;

public class Question9_writeOddNumbers {

	public static void main(String[] args) {
		int count=9;
		int num=0;
		
		while (num<=count) {
			if(num%2!=0) {
				if (num==count) {
					System.out.println(num);
					break;
				}
					System.out.print(num+",");					
			}
			num++;
		}

	}

}
