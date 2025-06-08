package daily_practic;

import java.util.Arrays;

public class All_metods_Strings {

	public static void main(String[] args) {
		
		//String str=new String("pooja"); ............we ca write like this.because it is a class
		String str1="pooja";
		String str2="amol";
		
		System.out.println(str1.length());
		
		System.out.println("charactors........");
		System.out.println(str1.charAt(0));
		
		System.out.println("print total string.......");
		String str="";
		for(int i=0; i<=str1.length()-1; i++) {
			str=str+str1.charAt(i);
		}
		System.out.println(str);
		
		System.out.println("ooj is a part of str1 or not... // it contain ooj or not...");
		System.out.println(str1.contains("ooj"));
		System.out.println("we need to write a propar sequence can not write like joo....");
		System.out.println(str1.contains("joo"));
		
		System.out.println("extact the substring ooj");
		System.out.println(str1.substring(1, 4));

		System.out.println("write a total string without using charAt()....by using toCharArray().....");
		char a[]=str1.toCharArray();
		String str3="";
		for(int i=0; i<str1.length()-1; i++) {
			str3=str3+a[i];
		}
		System.out.println(str3);
		
		String str4="pooja@amol_aswar";
		System.out.println(str4);
		System.out.println("remove the junk stuff from the str4...and make it as aseperate string...means split this string..");
		String t[]=str4.split("@");
		System.out.println(Arrays.toString(t));
	//	System.out.println(t[0]);
		
		String y[]=t[1].split("_");
		System.out.println(Arrays.toString(y));
		
		System.out.println(t[0]);
		System.out.println(y[0]);
		System.out.println(y[1]);
		
		String str5=" pooja amol aswar ";
		System.out.println(str5);
		System.out.println("remove the starting and end space...");
		System.out.println(str5.trim());
		
		System.out.println("remove the all space...");
		System.out.println(str5.replace(" ", ""));
		 
		System.out.println("replace amol by AMOL");
		System.out.println(str5.replace("amol","AMOL" ));
		
		//we can count the total words in a single string........
		String str6="mrs amol aswar";
		String s[]=str6.split(" ");
		
		System.out.println(Arrays.toString(s));
		System.out.println("the total words are :"+" "+s.length);
		
		String str7="pooja";
		String str8="Pooja";
		System.out.println(str7.equals(str8));
		
		System.out.println(str7.equalsIgnoreCase(str8));
		
		System.out.println(str7.toUpperCase());
		System.out.println(str8.toLowerCase());
		
		
	}

}
