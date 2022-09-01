package Chapters.Chapter03Exercises;
import java.util.Scanner ;

public class Chapter03_18 { 
 
	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the weight of the package :");
		double weight = input.nextDouble();
		
		System.out.println("cost of weight " + weight + "is" );
		
		if(weight <=1)
		System.out.println("3.5 dollars");
		else if(weight <=3)
			System.out.println("5.5 dollars");
		else if(weight <=10)
			System.out.println("8.5 dollars");
		else if (weight<=20)
		System.out.println("10.5 dollars");
		else 
			System.out.println("cannot shipped");
		
	}

}
