package daily_practic;

import java.util.Arrays;

public class Reverce_each_word_in_string {

	public static void main(String[] args) {
		String str="pooja amol aswar";
		
		
	//Approch 1:
		
		String reverce="";
		String [] words=str.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		for(String str2:words) {
			String revercewords="";
			System.out.println("length of array elements : "+str2.length());

			for(int i=str2.length()-1; i>=0; i--) {
				revercewords=revercewords+str2.charAt(i);
			}
			reverce=reverce+revercewords+" ";
		}
		System.out.println(reverce);
		
		//Approch2:
		
		
	/*	String [] words=str.split("\\s");
		String reverce="";
		for(String str2:words) {
			StringBuilder sb=new StringBuilder(str2);
			sb.reverse();
			reverce=reverce+sb.toString()+" ";
		}
		
		System.out.println(reverce);*/


	}

}
