package methods;

public class Methodsdemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int total = add();
		System.out.println(total);
		System.out.println("main method ended");
	}

	static int add() {
		int a = 500;
		int b = 700;
		int c = 900;
		int sum = a + b + c;
		return sum;

	}

}
