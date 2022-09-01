package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a degree in celcius:");
		
		double celciusDegree = input.nextDouble();
		 
		double fahrenheit = (9.0/5*celciusDegree + 32);
		
		
		System.out.println(fahrenheit);
		
		
	}

}
