package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_17 {

	public static void main(String[] args) {
	 
		Scanner input = new Scanner(System.in); 
		
		
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F :");
		
		double T = input.nextDouble();
		
		System.out.println("Enter the wind speed greater than or equal to 2 in miles:");
		double wS = input.nextDouble();
		
		double wC = (35.74) + (0.6215*T) - (35.75* Math.pow(wS, 0.16 ))+ (0.4275*T * Math.pow(wS,0.16) );
		
		System.out.println("the wind chill index is " + wC );
		
		
		

	}

}
