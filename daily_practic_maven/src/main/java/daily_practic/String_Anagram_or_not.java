package daily_practic;

import java.util.Arrays;

public class String_Anagram_or_not {

	//  Anagram : the word from which we can create the another word by arranging the charactors;
	
	public static void main(String[] args) {
		String str="aradhya";
		String str2="radhaya";
		
		char str3[]=str.toCharArray();
		char str4[]=str2.toCharArray();
		
		Arrays.sort(str3);
		System.out.println(Arrays.toString(str3));
		
		Arrays.sort(str4);
		System.out.println(Arrays.toString(str4));
		
		boolean status=Arrays.equals(str3, str4);
		
		if (str.length()==str2.length()) {
			
			if(status==true) {
				System.out.println("it is anagram");
			}
			else {
				System.out.println("it is not anagram *");
			}
		}
		else {
			System.out.println("it is not anagram");
		}
			
		

	}

}
