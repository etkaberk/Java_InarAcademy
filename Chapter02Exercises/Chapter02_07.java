package Chapters.Chapter02Exercises;

import java.util.Scanner;

public class Chapter02_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes : ");
		
		 int minutes = input.nextInt();
		 
		 int year = minutes/(60*24*365) ;
		 
		 int days = (minutes/60/24)%365 ; 
		 
		 System.out.println( year + " years and " + days + " days ");
		 
		 
		 
		 
		
		
		
		

	}

}
