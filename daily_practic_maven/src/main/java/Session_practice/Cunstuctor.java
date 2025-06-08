package Session_practice;

public class Cunstuctor {
	int x;
	int y;
	
	public Cunstuctor(){
		System.out.println("it is a default cunstructor");
		 x=100;
		 y=200;
		
	}
	
	public Cunstuctor(int a){
		System.out.println(a);
		
		
	}
	
	Cunstuctor(String str){
		System.out.println(str);
	}
	
	protected Cunstuctor(int b,int c){
		
		this.x=b;
		this.y=c;
		System.out.println(b+c);
	}
	
	protected void m1() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
	
		Cunstuctor cd1 =new Cunstuctor();
		Cunstuctor cd2 =new Cunstuctor(10);
		Cunstuctor cd3 =new Cunstuctor("irise");
		Cunstuctor cd4 =new Cunstuctor(20,30);
		//cd1.m1();
		
		
	}

}
