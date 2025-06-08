package practice_2;

import java.util.Arrays;

public class Count_number_of_words_in_String {

	public static void main(String[] args) {
		String str="hello word welcom to java";
//		int count=0;
//		String st[]=str.split(" ");
//		System.out.println(Arrays.toString(st));
//		
//		for(int i=0; i<=st.length-1; i++) {
//			count++;
//			
//		}
//System.out.println("no. of words in string are :"+" "+count);
int count=1;
		for(int i=0; i<=str.length()-1; i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=0)) {
				count++;
			}
			 
		}System.out.println(count);
	}

}
