package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("enter a point with two coordinates:");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		
		if (x>-5 && x<5 && y>-5 && y<5)
			System.out.println("point ("+ x + ","+y+")is in the rectangle");
		else 
		
			System.out.println("point ("+ x +")," + y +")is not in the rectangle");
		
	}

}
