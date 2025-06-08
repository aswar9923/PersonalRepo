package Session_practice;

public class Chiled_class extends  Methods_overloading_overriding {
	int a=20;
	
	
	public  void m1() {
		
		super.m1();
		System.out.println("it is a parent class mehod m1 which is overided");
		System.out.println(super.a);
	}
	 static void m1(int a,String str) {
			System.out.println("it is a parent class parameterize  mehod m1"+a+" "+str);
			
		}
	 public  int  m1(int a) {
		
			System.out.println("it is a parent class  parameterize int mehod m1 "+a);
			
			return a;
			
			}

	public static void main(String[] args) {
		Chiled_class cc=new Chiled_class();
		cc.m1(22);
		Chiled_class.m1("aswar", 33);
		Chiled_class.m1(44, "pp");
		cc.m1();
		
	}

}
