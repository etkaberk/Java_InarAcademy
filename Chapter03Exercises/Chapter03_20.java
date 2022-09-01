package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the temperature : ");
		double temp = input.nextDouble();
		System.out.println("enter the wind speed : ");
		double wind = input.nextDouble();
		
		
		if (temp <= 41 && temp >= -58 && wind >= 2 ) {
			double t = 35.74 + (0.6215 * temp) - ((35.75) * Math.pow(wind,0.16)) + (( 0.4275 * temp) * Math.pow(wind,0.16));
			System.out.println("windchill temperature is :" + t );
		}
		else System.out.println("the temperature or wind speed is invalid");
		
		
	}

}
