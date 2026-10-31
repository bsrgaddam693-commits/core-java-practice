package logicalstatements;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age:");

		int age = sc.nextInt();

		if (age < 0) {

			System.out.println("Invalid age");
		} else if (age < 18) {

			System.out.println("Not eligible to vote");
		} else {
			System.out.println("Are you an Indian citizen? (true/false)");
			boolean indianCitizen = sc.nextBoolean();

			if (!indianCitizen) {
				System.out.println("Not eligible to vote");
			} else {
				System.out.println("Do you have a voter ID? (true/false)");
				boolean hasVoterId = sc.nextBoolean();

				if (!hasVoterId) {
					System.out.println("Voter ID required");
				} else {
					System.out.println("Eligible to vote");
				}
			}
		}

		sc.close();
	}
}