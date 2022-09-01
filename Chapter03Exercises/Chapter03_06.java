package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_06 {

	public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			
			System.out.println("enter weight in pounds : "); 
			double pound = input.nextDouble();
			
			System.out.println("enter feet : ");
			double feet = input.nextDouble();
			
			System.out.println("enter inches :");
			double inches = input.nextDouble();
			
			
			double kg = pound * 0.45359237;
			
			double meterF = feet * 0.3048 ;
			
			double meterI = inches * 0.0254 ;
			
			
			double meterTotal = meterF + meterI ;
			
			double bmi = kg / (meterTotal * meterTotal) ;
			
			if (bmi < 18.5)
				System.out.println("underweight");
			else if (bmi < 25)
				System.out.println("normal");
			else if (bmi < 30)
				System.out.println("overweight");
			else 
				System.out.println("obese");
			
			System.out.println("and bmi is " + bmi );
			}
			
			
			
			
	}


