package pavan_sdet;
import java.util.Arrays;
import java.util.Scanner;

public class Reading_writing_data_into_arrays {

	public static void main(String[] args) {
	int a[]=new int[5];
	
	Scanner sc=new Scanner(System.in);
	
	for(int i=0; i<=5-1; i++) {
		System.out.println("Enter a value in posision"+i+":");
		 a[i]=sc.nextInt();
		 
	}
	
	System.out.println("Elements of arrays : ");
	System.out.println(Arrays.toString(a));

	
	
	}

}