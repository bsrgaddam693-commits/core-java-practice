package methods;

public class Methodsdemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Methodsdemo1 M = new Methodsdemo1();
		Methodsdemo1.Welcome();
		Hello();
		M.Nice();

	}

	public static void Welcome() {
		System.out.println("Welcom to KGM");// this is the method 1
	} // this to method s are static methods

	public static void Hello() {
		System.out.println("Hello Welcome to Kgm");// this is the another method
	}

	// I have to create another method instance
	public void Nice() {
		System.out.println("Have a nice day");// this is instance method
	}
}


//In any java program you have to call static methods are directly call No object creation
//But you can call instance methods create a object 
