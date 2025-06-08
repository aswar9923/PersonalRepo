package pavan_sdet;

public class How_may_dublicates_in_Arrays {
	
public static void main(String[] args) {
	int a[]= {1,2,3,2,4,2,5};
	int x=2;
	int count=0;
	
	for(int i=0; i<a.length;i++) {
			
		if(a[i]==x) {
			count++;
			}
	}
	System.out.println(count);
}
}
