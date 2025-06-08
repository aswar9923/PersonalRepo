package daily_practic;

public class Prime_no {

	public static void main(String[] args) {
		int a=3;
		int count =0;
		if(a>1) {
			for(int i=1; i<=a; i++) {
				
				if(a%i==0) {
					count++;}
				}
				if(count==2) {
					System.out.println("is a prime");
				}
				
				else {
					System.out.println("not prime");
				}
			
			
			
			
		}
		else {
			System.out.println("not prime");
		}
	
	

	}

}
