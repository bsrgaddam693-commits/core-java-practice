package methods;

public class Methodsdemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Methodsdemo4 M4 = new Methodsdemo4();
		Methodsdemo4.AgeInfo(30);
		FullName("Rakesh");
		M4.Weight(50.8);
		pincode((short) 5646);
		height(6f);
		M4.number(7864767378756L);
		M4.gender('M');
		M4.vote(true);
		System.out.println("main method ended");

	}

	public static void AgeInfo(int age) {
		System.out.println("Age Of The Person:" + age);
	}

	public static void FullName(String name) {
		System.out.println("Full Name Of The Person:" + name);
	}

	public void Weight(Double weight) {
		System.out.println("Weight Of The Person:" + weight);
	}

	public static void height(Float height) {
		System.out.println("Hight Of The Person:" + height);
	}

	public static void pincode(Short pincode) {
		System.out.println("Pincode Of The Person:" + pincode);
	}

	public void number(Long number) {
		System.out.println("Number Of THe Person:" + number);
	}

	public void gender(char gender) {
		System.out.println("Gender Of The Person:" + gender);
	}

	public void vote(boolean vote) {
		System.out.println("Are You Elegible For Vote:" + vote);

	}
}
