package daily_practic;

public class Find_missing_no_in_array {

	public static void main(String[] args) {
	
int a[]= {1,2,3,5};
 
int sum=0;
for(int i=0; i<=a.length-1;  i++) {
	sum=sum+a[i];
}
System.out.println(sum);

int sum2=0;
for(int i=1; i<=5; i++) {
	sum2=sum2+i;
}
System.out.println(sum2);

System.out.println(sum2-sum);

	}

}