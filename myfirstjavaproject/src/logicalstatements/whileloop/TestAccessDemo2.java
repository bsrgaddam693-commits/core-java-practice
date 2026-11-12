package logicalstatements.whileloop;

import logicalstatements.forloop.TestAccessDemo;

public class TestAccessDemo2 extends TestAccessDemo {
	public static void main(String[] args) {
		System.out.println("main method strated TestAccessDemo2");

		TestAccessDemo t1 = new TestAccessDemo();

//    Even though your class is public we cannot access the default data members outside of the packages
//		System.out.println(t1.id2);
//		System.out.println(t1.name2);
//		t1.method2();

//    Public data members we can access outside of the package too.
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

//    protected data members we cannot access protected data members outside of the packages directly
//	  we can access outside of the packages of subclasses with sub class object reference only.	

		TestAccessDemo2 t2 = new TestAccessDemo2();
		System.out.println(t2.id4);
		System.out.println(t2.name4);
		t2.method4();
		System.out.println("Main method ended");
	}

}
