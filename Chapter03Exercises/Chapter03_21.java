package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a year");
		
		int year = input.nextInt();
		
		System.out.println("enter the month");
		
		int month = input.nextInt();
		
		System.out.println("enter the day of the mont:");
		
		int day = input.nextInt();
		
		int century = year / 100 + 1 ;
		double h = day + (((month + 1)* 26) / 10) + ((year + year )/4 + (century/4 )+ (5 * century)%7);
		
		if (h == 0)System.out.println("it is saturday");
		if (h == 1)System.out.println("it is sunday");
		if (h == 2)System.out.println("it is monday");
		if (h == 3)System.out.println("it is tuesday");
		if (h == 4)System.out.println("it is wednesday");
		if (h == 5)System.out.println("it is thursday");
		else System.out.println("it is friday");
		
		
		
		
		
	}
		

}
