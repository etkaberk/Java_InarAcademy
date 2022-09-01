package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_13 {

	public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("enter the monthly saving amount:");
		 
		 double saving = input.nextDouble();
		 
		 double firstMounth = saving * (1+ 0.00417);
		 
		 double secondMounth = saving + firstMounth * ( 1+0.00417);
		 
		 double thirdMounth = saving + secondMounth * (1+ 0.00417);
		 
		 double fourthMounth = saving + thirdMounth * (1+0.00417);
		 
		 double fifthMounth = saving + fourthMounth * (1+0.00417);
		 
		 double sixthMounth = saving + fifthMounth* (1+0.00417);
		 
		
		 System.out.println("after the sixth mounth the acoount value is :" +  sixthMounth );
		
		 
		 
		 

	}

}
