package Chapters.Chapter03_checkpoints;

public class Checkpoint03_31 {

	public static void main(String[] args) {
		int x = 1;
		int a = 3;

		switch (a) {
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;
		case 4:
			x += 34;
		}
		System.out.println(x);
	}

}
