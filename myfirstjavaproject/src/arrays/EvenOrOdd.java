package arrays;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		int a[]= {10,3,23,4,56,78,93,77,50};
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i] % 2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("Even elements count:"+even);
		System.out.println("Odd elemnts count:"+odd);

	}

}
