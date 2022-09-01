package Chapters.Chapter02Exercises;

 import java.util.*;
public class Chapter02_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and a gratuity rate : ");
		
		double subtotal = input.nextDouble();
		
		double gratuityRate = input.nextDouble();
		
		
		double rate = gratuityRate*subtotal / 100;
		
		double total = subtotal + rate ; 
		
		System.out.println("the gratuity is " + rate + " and total is: " + total);
		
		
		
		
		
		
	}

}
