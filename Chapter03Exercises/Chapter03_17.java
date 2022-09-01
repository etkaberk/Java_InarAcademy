package Chapters.Chapter03Exercises;

import java.util.Scanner;

public class Chapter03_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int pc =(int)(Math.random()*3);
		
		System.out.println("scissor(0) ,rock(1), paper(2)");
	
		int number = input.nextInt();
		
		int player = input.nextInt();
		
		if (pc == player )
		System.out.println("the computer is paper, you are paper too. it is draw.");
		
		if (pc == 0 ) {
			
			System.out.println("the computer is scissor and you are ");
			if (player == 2  )
		System.out.println(" paper. You lost.");
 
			else if (player == 1) 
				System.out.println("rock.You won ");
			}
				else 
					System.out.println("scissor.It is draw.");
			
				 if (pc == 1 ) 
					System.out.println("the computer is rock and you are ");
					if (player == 0)
						System.out.println("scissor.You lost");
					else if (player == 2) 
					System.out.println("paper.You won");
					
					
					else 
						System.out.println("rock.it is draw");
					
					
				
					System.out.println("the computer is paper you are ");
					if (player == 0 )
							System.out.println("scissor.you won");
					
					else if (player ==1)
						System.out.println("rock. you lost.");
					
					else 
						 System.out.println("paper. it is draw.");
					
				
					
	}	
					
					
}			
					 
					
					
				
			
		
		
		
		
		
		
		
		


