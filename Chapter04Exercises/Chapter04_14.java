package Chapters.Chapter04Exercises;

import java.util.Scanner;

public class Chapter04_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter a letter grade (A,B,C,D or F): ");
		String g = input.next();
		
		char ch = g.charAt(0);
		ch = Character.toUpperCase(ch);
		
		if (ch >= 'A' && ch <= 'F' ) {
			switch (ch) {
			case 'A':System.out.println("the letter " + ch +" grade is " + 4);break;
			case 'B':System.out.println("the letter " + ch +" grade is " + 3);break;
			case 'C':System.out.println("the letter " + ch +" grade is " + 2);break;
			case 'D':System.out.println("the letter " + ch +" grade is " + 1);break;
			case 'F':System.out.println("the letter " + ch +" grade is " + 0);break;
			default:
			System.out.println(ch + "is an invalid grade");
			
			}
				
			}
			
		}
		
		
	}


