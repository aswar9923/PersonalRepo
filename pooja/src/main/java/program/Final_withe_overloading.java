package program;

public class Final_withe_overloading {
	
//	final void m1() {
//		System.out.println("pooja");
//		
//	}
	
	void m1(int a){
		System.out.println(a);
		
	}
	
	double m1(){
		return 10.0;
		
	}
	public static void main(String[] args) {
		 Final_withe_overloading b=new  Final_withe_overloading();
		double h= b.m1();
		System.out.println(h);
	}

}
