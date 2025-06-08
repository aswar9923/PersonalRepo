package daily_practic;

import java.util.Arrays;

public class Anagram_String_when_their_is_some_space {

	public static void main(String[] args) {
		String str="pooja amol aswar";
		String str2="pooja lmoa aswar";
		
		String str3= str.replaceAll(" ", "");
		char[] str5=str3.toCharArray();
		 
		Arrays.sort(str5);
		System.out.println(Arrays.toString(str5)); 
		
		String str4= str2.replaceAll(" ", "");
		char[] str6=str4.toCharArray();
		
		
		
		Arrays.sort(str6);
		System.out.println(Arrays.toString(str6)); 
		
		boolean status=Arrays.equals(str5, str6);
			
		if(str.length()==str2.length()) {
			if (status==true)
			{
				System.out.println(" anagram");
			}
			else {
				System.out.println("not* anagram");
			}
			
		}
		else {
			System.out.println("not anagram");
		}
				
		

	}

}
