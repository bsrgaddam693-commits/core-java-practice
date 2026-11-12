package arrays;

public class PositiveNegativeArray {

	public static void main(String[] args) {
		
		int a[]= {20,5,-3,-21,7,0};
		
		int positive=0;
		int negative=0;
		int zero=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>0) {
				positive++;
			}
			else if(a[i]<0) {
				negative++;
			}
			else {
				zero++;
			}
		}
		
		System.out.println("Positive elemnts count:"+positive);
		System.out.println("Negative elements count:"+negative);
		System.out.println("Zero elemnts count:"+zero);
		

	}

}
