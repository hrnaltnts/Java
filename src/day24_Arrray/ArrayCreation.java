package day24_Arrray;

public class ArrayCreation {

	public static void main(String[] args) {
		
		int score1=85;
		int score2=90;
		int score3=80;
		int score4=65;
		int score5=86;
	
		
		int avgScore= (score1+score2+score3+score4+score5) / 5;
		System.out.println(avgScore);
		
		
		int[] score=new int[5];
		score[0]=80;
		score[1]=70;
		score[2]=90;
		score[3]=10;
		score[4]=30;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		int avgScore2= (score[0]+score[1]+score[2]+score[3]+score[4]/5);
		System.out.println("Array Score"+avgScore2);
		
		
		
		
		
		
		
		
		//Option´1
		int[] numbers;
		numbers= new int[4];
		
		//Option´2
		int[] numbers1=new int[4];
		float[] temp=new float[100];
		char[] letter=new char[40];
		long units[]=new long[50];// if ahorter than 49 show error
		String word[]=new String[5];
		
		System.out.println(numbers[2]);// default 0
		System.out.println(temp[5]);//0.0
		System.out.println(letter[6]);//
		System.out.println(word[4]);//null
		System.out.println(units[49]);//0 
		
		

	}

}
