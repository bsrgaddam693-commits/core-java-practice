package logicalstatements;

import java.util.Scanner;

public class FootballMatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Barcelona score:");
		int barcelona = sc.nextInt();

		System.out.println("Enter a RealMadrid score:");
		int realmadrid = sc.nextInt();

		if (barcelona > realmadrid) {
			System.out.println("Barcelona Wins");
		}

		else if (realmadrid > barcelona){
			System.out.println("Real-Madrid Wins");
		}
		else  {
			System.out.println("Match Draw");
		}
		sc.close();
	}

}
