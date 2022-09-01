package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_30 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("enter the zone offset to GMT: ");
		
		long GMT = input.nextInt();
		
		long past = System.currentTimeMillis();
		
		long totalSeconds = past /1000 ;
		
		long hour = (totalSeconds/(60*60))%24;
		
		long minutes = (totalSeconds/60)%60 ;
		
		long seconds = totalSeconds %60 ;
		
		if (hour >= 12) 
			hour %= 12; 
		System.out.println(((hour + GMT)% 12) + ":"+ minutes + ":" + seconds +   "PM" ); 
		
		 while (hour < 12  && hour <=12)
			hour %= 12 ;
		System.out.println(((hour + GMT)% 12) + ":"+ minutes + ":" + seconds +  "AM" ); 
		

}
}