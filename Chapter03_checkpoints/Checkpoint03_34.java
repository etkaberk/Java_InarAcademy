package Chapters.Chapter03_checkpoints;

import java.util.Scanner;

public class Checkpoint03_34 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = input.nextInt();
		
		System.out.println((age >= 16) ? "Ticket price is 20 dollars" :"Ticket price is 10"  );
		
		
		
	}

}
