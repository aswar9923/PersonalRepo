package daily_practic;

public class Find_Maximum_minimum_no_in_array {

	public static void main(String[] args) {
		//find max no.
		//Case 1:
		/*int a[]= {90,20,100,80};
		int max=a[0];
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println(max);*/

		//Case 2:
	/*	int a[]= {90,20,50,80};
		int max=a[0];
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println(max);*/
		
		//find mini no
		int a[]= {90,20,100,80};
		int mini=a[0];
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]<mini) {
				mini=a[i];
			}
		}System.out.println(mini);
	}

}
