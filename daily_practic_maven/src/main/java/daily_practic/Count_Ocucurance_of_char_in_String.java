package daily_practic;

public class Count_Ocucurance_of_char_in_String {

	public static void main(String[] args) {
		String str="welcome to java world";
		
		int total_l=str.length();
		
	int l_after_rep =str.replace("e", "").length();
	
	int count =total_l-l_after_rep ;
	
	System.out.println("the no of occurance of a :"+count);

	}

}
