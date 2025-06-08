package daily_practic;

public class Factorials {

	//Factorial is a function that multiplies number by every number bllowe it;
	
	public static void main(String[] args) {
		int a=5;
		long factorial=1;
		
		//1*2*3*4*5
		
		/*for(int i=1; i<=5; i++) {
			factorial=factorial*i;
		}
		
System.out.println(factorial);*/
		
		//5*4*3*2*1
		
		for(int i=5; i>=1; i--) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
		
		
	}

}
