package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_14 {

	public static void main(String[] args) {
		System.out.println("enter weight in punds : ");
		
		System.out.println("enter height in inches : ");
		
	
	Scanner input = new Scanner(System.in);
	
	double weight = input.nextDouble();
	
	double height = input.nextDouble();
	
	double kg = weight * 0.45359237 ;
	
	double m = height * 0.0254 ;
	
	double bmi = kg/ (m*m); 
	
	System.out.println("bmi is " + bmi );
	
	
	
	
	
	
			
	
	  

	}

}
