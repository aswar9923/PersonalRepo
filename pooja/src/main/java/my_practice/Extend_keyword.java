package my_practice;

class No_1{
	
	double m1() {
		
		return 10;
		
		
	}
	
}

class No_2 extends No_1   {
	double m1() {
		return 2;
	}
}
public class Extend_keyword {
	
protected int m1() {
	return 10;
}

	public static void main(String[] args) {
		No_1 n=new No_1();
		double w=n.m1();
		System.out.println(w);
		
		No_2 b=new No_2();
		System.out.println(b.m1());
		
	}
		
}


