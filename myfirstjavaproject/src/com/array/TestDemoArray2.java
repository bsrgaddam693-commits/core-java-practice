package com.array;

import java.util.Scanner;

public class TestDemoArray2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Aize:");
		int n = sc.nextInt();

		int arr[] = new int[n];

		int positive = 0;
		int negative = 0;
		int zero = 0;

		System.out.println("Enter Array Element:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {

			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] < 0) {
				negative++;
			} else {
				zero++;
			}
		}
		System.out.println("Positive count:" + positive);
		System.out.println("Negative count:" + negative);
		System.out.println("Zero count:" + zero);

	}

}
