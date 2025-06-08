package daily_practic;

public class Even_odd_numbers_in_Arrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int count_even=0;
		int count_odd=0;
		
		for(int i=0; i<=a.length-1; i++) {
			
			if(a[i]%2==0) {
				System.out.println("even nos are : "+" "+a[i]);
			count_even++;
			}
			else {
				System.out.println("odd nos are : "+" "+a[i]);
				count_odd++;
			}
		}
		System.out.println("*****************************");
		System.out.println("even nos are : "+" "+count_even);
		System.out.println("odd nos are : "+" "+count_odd);
		
	/*	for(int i=0; i<=a.length-1; i++) {
			if(a[i]%2==0) {
				System.out.println("even nos are : "+" "+a[i]);
		}
		}
		System.out.println("**************************");
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]%2!=0) {
				System.out.println("odd nos are : "+" "+a[i]);
		}
		}*/
	}

}
