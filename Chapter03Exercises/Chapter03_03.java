package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a,b,c,d and f :");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double x = (e * d - b * f) * (a * d - b * c );
				
		double y = (a * f - e * c)/ (a * d - b * c);
		
		if (a * d - b * c == 0 ) {
			
			System.out.println(" the equation has no solution");
		}
			else System.out.println("x is " + x + "y is " + y);
			
		
		
		
		
		}
		
	}


