package Session_practice;

public class Childe implements Parent_1,Parent_2,Parent_3 {

	@Override
	public int m1(int a, int b) {
		System.out.println(a+b);
		return a;
	}
	@Override
	public int m7() {
		int f=12;
		System.out.println(f);
		return f;
	
	}

	@Override
	public void m8() {
		System.out.println(d+l);
		
	}
	@Override
	public void m1() {
		System.out.println(a+" "+str);
		
	}

	
	public static void main(String[] args) {
		Parent_1  p1=new Childe();
p1.m1();
Parent_1.m2();
p1.m3();
System.out.println("******************");

Parent_2 p2=new Childe();
p2.m7();
p2.m8();
System.out.println("**********************");

Parent_3 p3=new Childe();
p3.m1(33, 22);
System.out.println("******************");

System.out.println("calling from childe class");
System.out.println("by creating object of childe class");
System.out.println("it is not secuire");
System.out.println("                        ");
Childe c=new Childe();
System.out.println(c.a);
System.out.println(c.str);
System.out.println(c.l);
System.out.println(c.d);
c.m1();
c.m3();
c.m1(55, 66);
c.m7();
c.m8();

	}
	


	
	

}
