package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_22 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("enter the coordinates of the point: ");
	double coX= input.nextDouble();
	double coY= input.nextDouble();
	
	double distance = Math.pow(((coX - 10)*(coX - 10)) +((coY- 10)*(coY - 10)) , 0.5);
	
	if (distance <= 10 )
		 System.out.println("the point is in the circle");
	else System.out.println("the point is not in the circle");
	
				 
		
		
		
		
	}

}
