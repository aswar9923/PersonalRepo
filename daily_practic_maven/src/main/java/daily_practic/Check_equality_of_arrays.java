package daily_practic;

public class Check_equality_of_arrays {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {1,2,3,4,5};
	boolean status=true;
	
	if(a.length==b.length) {
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]!=b[i]) {
				status=false;
			}
			
		}
		
	}
	else {
		status=false;
	}
	if(status==true) {
		System.out.println("it is equal");
	}
	else {
		System.out.println("it is not equal");
	}
	}

}
