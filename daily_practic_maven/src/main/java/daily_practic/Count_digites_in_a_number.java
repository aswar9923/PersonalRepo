package daily_practic;

public class Count_digites_in_a_number {

	public static void main(String[] args) {
		int a=1234;
		int count=0;
		
		while(a>0) {
			a=a/10;
			count++;
			
		}System.out.println("the no.of digite found are :"+" "+count);

	}

}
