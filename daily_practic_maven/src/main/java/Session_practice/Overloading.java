package Session_practice;

public class Overloading {
public void m1() {
	System.out.println("it is a non parameterize method m1");
}
public void m1(int a, int b) {
	System.out.println("it is a  parameterize method m1");
	System.out.println(a+b);
}
public void m1(double d,int t) {
	System.out.println("it is a  parameterize method m1 : "+" "+d+t);
}
public void m1(String str) {
	System.out.println("it is a non parameterize method m1 : "+" "+str);
	
}
	public static void main(String[] args) {
		Overloading ovr = new Overloading ();
		ovr.m1();
		ovr.m1(10, 20);
		ovr.m1(1.2, 10);
		ovr.m1("pooja");

	}

}

