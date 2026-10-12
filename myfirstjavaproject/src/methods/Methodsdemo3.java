package methods;

public class Methodsdemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		addition(100, 200);
		subtraction(300, 500);
		division(588, 637);
		multiplication(7635, 873);
		System.out.println("main method ended");
		Methodsdemo3 M1 = new Methodsdemo3();
		M1.addition1(6557, 6457);

	}

	public static void addition(int a, int b) {
		System.out.println("Addition method called");
		System.out.println(a + b);
	}

	public static void subtraction(int a, int b) {
		System.out.println("subtraction method called");
		System.out.println(a - b);
	}

	public static void division(int a, int b) {
		System.out.println("division method called");
		System.out.println(a / b);
	}

	public static void multiplication(int a, int b) {
		System.out.println("multiplication method called");
		System.out.println(a * b);
	}

	public void addition1(int a, int b) {
		System.out.println(a + b);
	}

}
