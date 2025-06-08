package daily_practic;

import java.util.Random;

public class Randome_numbers {

	public static void main(String[] args) {
		//case 1:
		
		Random r =new Random();

		int d=r.nextInt(100);   //it gives a values between 1 to 99
		System.out.println(d);
		
		int dd=r.nextInt(1000);   //it gives a values between 1 to 999   like wise
		System.out.println(dd);
		
		double s=r.nextDouble();  //it gives a values between 0.0   to  1.0
		System.out.println(s);
		
		//case 2:
		
		System.out.println(Math.random());   //it gives a values between 0.0 to 1.0
	}

}
