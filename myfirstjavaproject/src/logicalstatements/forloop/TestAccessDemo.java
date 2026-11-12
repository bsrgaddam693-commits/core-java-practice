package logicalstatements.forloop;

public class TestAccessDemo {
	// default data members
	int id2 = 18;
	String name2 = "subbu";

	void method2() {
		System.out.println("Method2 called");
	}

	// public data members
	public int id3 = 49;
	public String name3 = "rakesh";

	public void method3() {
		System.out.println("Method3 called");
	}

	// protected data members
	protected int id4 = 49;
	protected String name4 = "rakesh";

	protected void method4() {
		System.out.println("Method4 called");
	}

	public static void main(String[] args) {
		TestAccessDemo t1 = new TestAccessDemo();

		// Default data members we can access within the class
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

		// Public data members we can access within the class
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

		// protected data members we can access within the class
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

	}
}
