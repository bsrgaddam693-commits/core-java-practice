package com.array;

public class TestDemoArrayP3 {
	public static void main(String[] args) {
    System.out.println("main method streted");
		int[] number = { 29, 44, 65, 76, 86, 93, 36 };
		int sum = 0;

		for (int num : number) {
			sum += num;	
 	}
		TestDemoArrayP3 a1 = new TestDemoArrayP3();
		a1.method();

		System.out.println("sum:" + sum);

	}

	void method() {
		int[] numbers = { 425, 65, 767, 87 };
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

		}
		
		System.out.println("Sum of Arrys:" + sum);
		
	}
}
