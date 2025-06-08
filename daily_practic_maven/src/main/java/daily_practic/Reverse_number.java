package daily_practic;

public class Reverse_number {

	public static void main(String[] args) {
		int a=7648;
		//by using algarithem..........
		/*int rev=0;
		while(a!=0) {
			rev=rev*10+a%10; //1234%10=4; 4*10=40,123%10=3, 40+3=43; 43*10=430,12%10=2,430+2=432; 432*10=4320,1%10=1,4320+1=4321
			
			a=a/10;   //1234/10=123;123/10=12;12/10=1;1/10=0
		}
		System.out.println(rev);*/
		//*******************************************************************
		//by StringBuffer methods
		
		/*String str=String.valueOf(a); //...............convert int into String
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb);
		
		System.out.println(sb.reverse());*/
		//********************************************************************
		
		//by StringBuilder methods  by append()
		
		StringBuilder sbl=new StringBuilder();
		StringBuilder sd=sbl.append(a);
		System.out.println(sd);
		
		StringBuilder ss=sd.reverse();
		System.out.println(ss);
		
		
		

}

}
