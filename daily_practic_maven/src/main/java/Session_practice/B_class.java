package Session_practice;

public class B_class extends  _A_class {
	public void m1() {
		System.out.println("it is parent class method m1 which is override");
	}

	public void m2() {
		System.out.println("it is parent class method m2 which is override");
	}

	public void m3(int a,int b) {
		System.out.println("a+b");
	}
	public static void main(String[] args) {
		B_class b=new B_class();
		b.m1();
		b.m2();
		b.m3(10, 20);
	}

}

