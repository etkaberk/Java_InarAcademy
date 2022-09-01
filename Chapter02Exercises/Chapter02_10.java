package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_10 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter the amount of water in kilograms : ");
			System.out.println("Enter the initial temperature : ");
			System.out.println("Enter the final temperature : ");
			
			double kg = input.nextDouble(); 
			
			double iTemperature = input.nextDouble();
			
			double fTemperature = input.nextDouble();
			
			double energy = kg * (fTemperature - iTemperature )* 4184 ;
			
			
			System.out.println("The energy needed is : " + energy );

	}

}
