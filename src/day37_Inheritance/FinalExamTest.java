package day37_Inheritance;

import java.util.*;

public class FinalExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ask user how many question in exam
		// ask user how many question missed
		//give user  lettergrade(a,b,d)
		
		Scanner scan= new Scanner(System.in);
		
		int questions;
		int missed;
		
		System.out.println("How many questions are on the final exam?");
		questions=scan.nextInt();
		
		System.out.println("How many question did the student miss?");
		missed=scan.nextInt();
		
		FinalExam exam= new FinalExam(questions,missed); 
		
		System.out.println("The grade for this exam is "+ exam.getGrade());
			
		
		

	}

}

//How many questions are on the final exam?
//100
//How many question did the student miss?
//50
//The grade for this exam is F
//
