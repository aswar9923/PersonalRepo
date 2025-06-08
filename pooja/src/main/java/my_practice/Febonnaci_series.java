package my_practice;

public class Febonnaci_series {

	public static void main(String[] args) {
	int a=1;
	int b=2;
	int c;
	for (int i=2; i<=10; i++ ) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
	

	}

}
