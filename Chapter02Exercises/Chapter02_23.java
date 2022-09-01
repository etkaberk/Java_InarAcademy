package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_23 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance :");
		
		
		System.out.println("Enter miles per gallon:");
		
		System.out.println("Enter price per gallon:");
		
		double distance = input.nextDouble();
		
		double milesPerGallon = input.nextDouble ();
		
		double pricePerGallon = input.nextDouble();
		
		double cost = (pricePerGallon * distance ) / milesPerGallon ;
		
		System.out.println("the cost of driving is " + cost);
		
		
		
		
				
		
		
		
	

	}

}
