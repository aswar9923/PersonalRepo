package daily_practic;

import java.util.Arrays;

public class Sorting_by_bubble_sort {

	public static void main(String[] args) {
		int a[]= {5,3,4,2,6};
		
		
		
		
		int n=a.length;  //5 
		for(int i=0; i<n-1; i++) {    //...n-1=4........>number of passes.........(0,1,2,3);
			for(int j=0; j<n-1; j++) {   //....number of ittretion
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		




	}

}
