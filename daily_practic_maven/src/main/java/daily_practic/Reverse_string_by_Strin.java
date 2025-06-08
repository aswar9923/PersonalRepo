package daily_practic;

public class Reverse_string_by_Strin {

	public static void main(String[] args) {
		String str="pooja";
		//str="me";
		String str1="amol";
String d= str.concat(str1);
System.out.println(d);
System.out.println(str); //..........immutable

/*int a=10;
System.out.println(a-5);
System.out.println(a);*/

//Revers string by charat method

/*String s="";
for(int i=str.length()-1; i>=0; i--) {
	s=s+str.charAt(i);
}
System.out.println(s);*/

//Revers string by toCharArray method

String s="";

char c[]=str.toCharArray();

for(int i=str.length()-1; i>=0; i--) {
	
	s=s+c[i];
}
System.out.println(s);

	}

}
