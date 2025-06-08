package daily_practic;

public class Find_even_odd_numbers_of_digites_found_in_number {

	public static void main(String[] args) {
		int a=12345678;
		
		int count_even=0;
		int count_odd=0;
		
		while(a>0) {
			int rem=a%10;
			if(rem%2==0) {
				count_even++;
			}
			else {
				count_odd++;
			}
			
			a=a/10;
		}
		System.out.println(count_even);
		System.out.println(count_odd);
	}

}
