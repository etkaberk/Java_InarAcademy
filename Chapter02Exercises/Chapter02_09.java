package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v0 , v1 and t");
		
		double v0 = input.nextDouble();
		
		double v1 = input.nextDouble();
		
		double t = input.nextDouble();
		
		double a =(v1 - v0)/t ;
		
		System.out.println(a);
		
	}

}
