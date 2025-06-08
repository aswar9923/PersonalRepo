package daily_practic;

public class Febonacci_series {

	public static void main(String[] args) {
		//series of a numbers in which each numbers is a sum of two precending  numbers;
		
	// print 0,1,2,3,5,8,13,21
		
		int a=0,b=1;
		System.out.print(a+" ");
		for (int i=1; i<10; i++) {//0,1,2,3,4,5
			
			int c=a+b; //1,2,3,5,8,13
			System.out.print(c+" ");
			a=b;//1,1,2,3,5,8
			b=c;//1,2,3,5,8,13
		}

	}

}
