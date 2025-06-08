package session_2;

public class Cunst_1 {
	int x;
	int y;
	protected  Cunst_1(){
		System.out.println("it is a default cunstructor");
		x=100;
		y=200;
		
	}
	public   Cunst_1(int a,int b) {
		x=a;
		y=b;
		
	}
	 public void m1(int c,int d) {
		 x=c;y=d;
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		//Cunst_1 ct=new Cunst_1();

	}

}
