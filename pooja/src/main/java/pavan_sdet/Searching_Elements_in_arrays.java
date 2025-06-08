package pavan_sdet;

public class Searching_Elements_in_arrays {

	public static void main(String[] args) {
		int a[]= {10 ,20, 30, 40};
		int x=30;
		for(int i=0; i<=a.length-1; i++) {
			
			if (a[i]==x) {
				System.out.println("Element found");
			}
			
			
		}
		System.out.println("Element not found");

	}

}
