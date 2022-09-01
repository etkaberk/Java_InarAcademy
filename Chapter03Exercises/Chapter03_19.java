package Chapters.Chapter03Exercises;
import java.util.Scanner;

public class Chapter03_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the edges lenght for a triangle : ");
		
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		double perimeter = s1 + s2 + s3 ;
		
		if(s1 + s2 >s3 && s1 + s3 > s2 && s2 + s3 > s1 )
		System.out.println(" the perimeter of the triangle is " + perimeter );
		
		else System.out.println("the input is invalid");
		
		
		
		
		
		
		
		
	}

}
