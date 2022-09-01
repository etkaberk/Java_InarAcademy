package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter investment amount:");
		
		System.out.println("Enter annual interest rate in percentage:");
		
		System.out.println("Enter number of years :");
		
		double amount = input.nextDouble(); 
		
		double rate = input.nextDouble();
		
		double years = input.nextDouble();
		
		double future = amount * ( Math.pow(( 1 +  rate ), (years * 12)));
		
		System.out.println("Accumulated value is :" + future );		
		
		
		
		
		

	}

}
