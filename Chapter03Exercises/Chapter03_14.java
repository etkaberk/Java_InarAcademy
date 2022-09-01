package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pc = (int)(Math.random()*10 %2);
		System.out.println("enter a guess 0(for heads) or 1(for tails) : ");
		int number = input.nextInt();
		
			if (number == pc )
		       System.out.println("you are corret");		
		       else if (number< pc || number > pc)
		    	   System.out.println("you are incorrect");
		
		
			

	}

}
