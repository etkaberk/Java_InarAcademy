package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_05 {

	public static void main(String[] args) {
	 
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter todays day :" );
	int days = 	input.nextInt()	;
	
	
    System.out.println("Enter the number of days elapsed since today :");	
    int elapsed = input.nextInt();
    
    int today = (days + elapsed )% 7;
    
    if (today == 0) {
    	System.out.println("the day is sunday");}
    if (today == 1) {
    	System.out.println("tha day is monday"); }
    if (today == 2) {
    	System.out.println("the day is tuesday");}
    if (today ==3) {
    	System.out.println("the day is wednesday");}
    if (today == 4 ){
        System.out.println("the day is thursday");}
    if (today == 5) {
    	System.out.println("the day is friyday");}
    if (today == 6) {
    	System.out.println("tha day is saturday");}
    }
    
    
    
	
		
		

	}


