package my_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Writing_reading_elements_int_arrays {

	public static void main(String[] args) {
		int a[]=new int [5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=a.length-1; i++) {
			System.out.println("Enter a value in posision "+i+":");
			a[i]=sc.nextInt();
			
		}
		System.out.println("................................");
		System.out.println(Arrays.toString(a));

	}

}
