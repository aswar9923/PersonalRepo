package pavan_sdet;

public class Read_all_the_char_in_string {

	public static void main(String[] args) {
		String str="welcome";
		String str1="";
		for(int i=0; i<str.length(); i++) {
			str1=str1+str.charAt(i);
			
		}
System.out.println(str1);
	}

}
