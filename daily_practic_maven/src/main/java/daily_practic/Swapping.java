package daily_practic;

public class Swapping {

	public static void main(String[] args) {
		int a=10;
		int b=20;

		//Case 1:By using 3rd variable:
		/*int c=b-a; //10..................................1
		b=c;
		System.out.println(b);

		a=c+b;
		System.out.println(a);*/
		
		/*int c=a+b;...........................................2
		a=b;//20
		b=c-b;

		System.out.println(a+"  "+b);*/

		//Case 2: without 3rd variable:

		/*b=b-a;..................................................1
		System.out.println(b);

		a=a+b;
		System.out.println(a);*/
		
		/*b=a;.....................................2
		a=a+b;
		System.out.println(b+"  "+a);*/
		
		//By using division & multiplication
		
		b=a*b;  //200
		a=b/a;
		System.out.println(a);
		b=b/a;
		System.out.println(b);
	}

}
