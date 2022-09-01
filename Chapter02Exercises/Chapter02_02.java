package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_02 {

	public static void main(String[] args) {
		System.out.println("Enter the area and lenght of a cylinder:");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double lenght = input.nextDouble();
		double area = radius * radius * 3.14159;
		double volume = area * lenght;
		 
		System.out.println("The area is: " + area + " The volume is : " + volume);
		
		
		
		
		
				

	}
}
