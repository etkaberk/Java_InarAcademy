package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_11 {

	public static void main(String[] args) {
		
     Scanner input = new Scanner(System.in);
     System.out.println("enter the mounth  :");
     int mounth = input.nextInt();
     
     System.out.println("enter the year  :");
     int year = input.nextInt();

		switch(mounth) {
		case 1 :System.out.println("january" + year + "31 days"); break; 
		case 2 :System.out.println("february" + year + (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? " 29 days" : " 28 days"));break;
		case 3 :System.out.println("march" + year + "31 days");break;
		case 4 :System.out.println("april" + year + "30 days");break;
		case 5 :System.out.println("may" + year + "31 days");break;			
		case 6 :System.out.println("june" + year + "30 days");break;
		case 7 :System.out.println("july" + year + "31 days");break;
		case 8 :System.out.println("august" + year + "31 days");break;
		case 9 :System.out.println("september" + year + "30 days");break;
		case 10 :System.out.println("october" + year + "31 days");break;
		case 11 :System.out.println("november" + year + "30 days");break;
		case 12: System.out.println("december" + year + "31 days");break;
		
		
			
		}
		
		
		
		
		
	}

}
