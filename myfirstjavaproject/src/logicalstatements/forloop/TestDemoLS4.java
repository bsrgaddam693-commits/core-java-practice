package logicalstatements.forloop;

import java.util.Random;
import java.util.Scanner;

public class TestDemoLS4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		int guss = ra.nextInt(10);
		boolean guessed=false;
		
		for(int i=1;i<=3;i++) {
			System.out.println("Guess a number between 1 and 10");
			int guess = sc.nextInt();
			if(guess == guss) {
				System.out.println("Congratulations you guess the correct number");
				guessed=true;
				break;
				
			}else if(guess<guss) {
				System.out.println("Too low! try again");
			}else {
				System.out.println("Too high! try again");
			}
		}
		if(!guessed) {
			System.out.println("Game over!");
			System.out.println("Correct number is:"+guss);
		}
		
	}

}
