package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter speed and acceleration :");
		
		double v = input.nextDouble();
				
		double a = input.nextDouble();
		
		double length = (v*v)/ (2*a );
		
		System.out.println(" the minimum runway length for this plane is "+ length );
		
		
		
		
		
		
		

	}

}
