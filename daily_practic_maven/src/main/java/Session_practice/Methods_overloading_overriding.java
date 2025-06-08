package Session_practice;

public class Methods_overloading_overriding {
	int a=10;
	public void m1() {
		System.out.println("it is a parent class mehod m1");
	}
	 static void m1(int a,String str) {
		System.out.println("it is a parent class parameterize  mehod m1");
	}
	public  int  m1(int a) {
		System.out.println("it is a parent class  parameterize int mehod m1");
		return a;
		
	}
	public static void m1(String str,int a) {
		System.out.println("it is a parent class mehod m1");
	}
	
	
	
	
	
	public static void main(String[] args) {
		Methods_overloading_overriding ovl=new Methods_overloading_overriding();
		ovl.m1();
		m1(10,"pooja");
		ovl.m1(40);
		m1("amol",20);
		
	}

}
