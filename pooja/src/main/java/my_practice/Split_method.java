package my_practice;

import java.util.Arrays;

public class Split_method {

	public static void main(String[] args) {
		String str="pooja,amol@123gmail.com";
String a[]=str.split(",");
System.out.println(Arrays.toString(a));

String b[]=a[1].split("@");
System.out.println(Arrays.toString(b));

System.out.println(a[0]);
System.out.println(b[0]);
System.out.println(b[1]);
	}

}
