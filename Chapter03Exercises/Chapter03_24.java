package Chapters.Chapter03Exercises;

public class Chapter03_24 {

	public static void main(String[] args) {
     int card =(int)(Math.random() * 13 +1) ;
     int colour = (int)(Math.random()* 4 + 1);

    		 
    		 
     switch(card) {
     
     case 1 : System.out.println("ace"); break;
     case 2 : System.out.println("2"); break;
     case 3 : System.out.println("3"); break;
     case 4 : System.out.println("4"); break;
     case 5 : System.out.println("5"); break;
     case 6 : System.out.println("6"); break;
     case 7 : System.out.println("7"); break;
     case 8 : System.out.println("8"); break;
     case 9 : System.out.println("9"); break;
     case 10 : System.out.println("10"); break;
     case 11: System.out.println("jack"); break;
     case 12 : System.out.println("queen"); break;
     case 13 : System.out.println("king"); break;
     }
     
     
     switch(colour) {
     case 1 : System.out.println("clubs"); break;
     case 2 : System.out.println("diamonds"); break;
     case 3 : System.out.println("hearts"); break;
     case 4 : System.out.println("spades"); break;
     }
    
     
     }
     
		
		
		
		
	}

