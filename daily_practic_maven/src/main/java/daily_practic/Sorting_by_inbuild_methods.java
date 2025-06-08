package daily_practic;

import java.util.Arrays;
import java.util.Collections;

public class Sorting_by_inbuild_methods {

	public static void main(String[] args) {
		
//int a[]= {30,20,50,40,10};

//Aproche 1:
/*Arrays.sort(a);
System.out.println(Arrays.toString(a));*/

//Approche 2 :

/*Arrays.parallelSort(a);
System.out.println(Arrays.toString(a));*/

//******************************************

//Sorting by desending order

Integer a[]= {30,20,50,40,10};

Arrays.sort(a,Collections.reverseOrder());
System.out.println(Arrays.toString(a));
	}

}
