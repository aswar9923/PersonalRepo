package daily_practic;

public class Identify_string_is_palandrone_or_not {

	public static void main(String[] args) {
		String str="madam";
		String str1="";
		
		for(int i=str.length()-1; i>=0; i--) {
			str1=str1+str.charAt(i);
			
		}
		System.out.println(str1);
		
		if(str.equals(str1)) {
			
			System.out.println("str is a palandrone");
		}

	}

}
