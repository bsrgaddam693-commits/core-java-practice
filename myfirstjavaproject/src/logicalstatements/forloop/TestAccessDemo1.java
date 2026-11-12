package logicalstatements.forloop;

public class TestAccessDemo1 {

	public static void main(String[] args) {
		System.out.println("main method startde from TestAccesDemo1");
		TestAccessDemo t1 = new TestAccessDemo();

		// Default data members we can access outside of the class
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

		// Public data members we can access outside of the class
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

		// protected data members we can access outside of the class
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

	}
}
