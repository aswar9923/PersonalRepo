package pavan_sdet;

public class Palendrone {

	public static void main(String[] args) {
	String str="pooja";
	String str1="";
	for(int i=str.length()-1; i>=0; i--) {
		str1=str1+str.charAt(i);
		
	}
System.out.println(str1);

if(str1==str) {
	System.out.println("my name is palandron");
}
else {
	System.out.println("my name is not palandron");
}
	}

}
