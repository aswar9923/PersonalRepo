package practice_2;

public class Reverse_intiger {

	public static void main(String[] args) {
		int x=1234;
		int rev=0;
//		while(x!=0) {
//			
//			rev=rev*10+x%10;
//			x=x/10;
//		}System.out.println(rev);
		
	
		StringBuffer sb=new StringBuffer(String.valueOf(x));
		System.out.println(sb.reverse());
		
		StringBuilder sd=new StringBuilder();
		sd.append(x);
		System.out.println(sd.reverse());

	}

}
