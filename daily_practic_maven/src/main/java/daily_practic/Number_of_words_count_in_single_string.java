package daily_practic;

import java.util.Arrays;
import java.util.Scanner;

public class Number_of_words_count_in_single_string {

	public static void main(String[] args) {
		System.out.println("Enter the value.........");

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();  //welcome to java

		//using charAt()..........
		/*int count=1;

for(int i=0; i<=str.length()-1; i++) {

	if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
		count++;

	}
}System.out.println(count);*/
		
//***********************************************************************
	//using split method......by using for() loop
		
		/*String s[]=str.split(" ");
		System.out.println(Arrays.toString(s));
		int count = 0;
		for(int i=0; i<=s.length-1; i++) {
			count++;
		}
		System.out.println(count);*/
		
		//*************************************************************
	
		//using split()......only by length

		/*String s[]=str.split(" ");
		System.out.println(Arrays.toString(s));
System.out.println("the words present in string are : "+" "+s.length);*/
		

	}

}
