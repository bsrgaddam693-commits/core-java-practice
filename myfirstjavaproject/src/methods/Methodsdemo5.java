package methods;

public class Methodsdemo5 {

	public static void main(String[] args) {
		sscmarks(70, 80, 87, 97, 90, 78, 88);
		diplomamarks(478, 500, 499);
		Methodsdemo5 M5 = new Methodsdemo5();
		M5.Btechmarks(450, 500, 470, 450, 466, 499);

	}

	static void sscmarks(int t, int h, int m, int e, int ns, int ps, int s) {
		int sum = t + h + m + e + ns + ps + s;
		System.out.println("total matkes in ssc:" + sum);
		int avg = sum / 7;
		System.out.println("avg marks of ssc:" + avg);
	}

	static void diplomamarks(int firstyear, int secondyear, int thirdyear) {
		int sum = firstyear + secondyear + thirdyear;
		System.out.println("total htree years marks:" + sum);
		int avg = sum / 3;
		System.out.println("avg marks os deploma:" + avg);

	}

	void Btechmarks(int semone, int semtwo, int semthree, int semfour, int semfive, int semsix) {
		int sum = semone + semtwo + semthree + semfour + semfive + semsix;
		System.out.println("total six sems marks:" + sum);
		int avg = sum / 6;
		System.out.println("avg marks of six sems:" + avg);
	}
}
