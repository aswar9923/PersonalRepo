package Session_practice;

import java.util.Scanner;

public class Scanner_class {
	
	void m1(int a,int b) {
		int c=a+b;
		System.out.println("the addition is : "+" "+c);
		
	}
	 double m2(int a,int b) {
		 System.out.println("the multiplication is : "+" "+a*b);
		 return a*b;
	 }
	 static void m3(int a,int b) {
		 System.out.println("the substraction is : ");
		 System.out.println(a-b);
		 
	 }
static void m4(int a,int b) {
	System.out.println("the division is : "+" "+a/b);
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value of a : ");
		int a=sc.nextInt();
		
		System.out.println("Enter a value of b : ");
		int b=sc.nextInt();
		
		Scanner_class ss=new Scanner_class ();
		ss.m1(a, b);
		ss.m2(a, b);
		m3(a,b);
		m4(a,b);

	}

}
