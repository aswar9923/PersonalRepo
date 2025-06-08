package pavan_sdet;
import java.util.Arrays;
public class Sorting_Elements_in_Arrays {

	//we can arrange the elements by the assending or desending also by using Arrays.toSorting method;

	public static void main(String[] args) {
		int a[]= {60,80,30,70,10,20};

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);

		}


	}
}
