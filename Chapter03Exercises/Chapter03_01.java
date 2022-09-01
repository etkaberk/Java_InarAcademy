package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_01 {

	public static void main(String[] args) {
		
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("enter a:");
	  double a = input.nextDouble();
	  
	  System.out.println("enter b:");
	  double b = input.nextDouble();
	  
	  System.out.println("enter c:");
	  double c = input.nextDouble();
	  
	  double disc = b*b - 4*a*c ;
	 
	  
	  double r = ( - b +( Math.pow((b * b) - 4*a*c , 0.5))) / 2*a ;
	  
	  double rII = ( - b - ( Math.pow((b * b )- 4*a*c , 0.5))) / 2*a ;
	  
	  if (disc < 0 ) { 
		System.out.println("there is no real root");  
		}
	  if (disc > 0 ) {
		  
		  System.out.println("the root I : " + r + " and the root II : " + rII);
	  
		  }
	   else System.out.println("the root is " + r);
	  
	  
	  }
	  
	 

	}


