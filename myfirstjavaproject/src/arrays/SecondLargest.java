package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int a[]={2,7,13,9,8,13};
		
		int largest=0;
		int second=0;
		
		for(int i=0;i<a.length;i++) {
			if(largest==0 || a[i]>largest) {
				second=largest;
				largest=a[i];
			}
			else if(a[i]!=largest&&(second==0||a[i]>second)) {
				second=a[i];
			}
		}

		if(second == 0)
        {
            System.out.println("Second largest distinct element not found");
        }
        else
        {
            System.out.println("Second largest distinct element is: " + second);
        }
    }
}
