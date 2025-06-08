package my_practice;

public class Revers_string {

	public static void main(String[] args) {
		String name="pratik";
		String str="";
		for(int i=0; i<=name.length()-1; i++) {
		str=str+name.charAt(i);
			
		}
		System.out.println(str);
	}

}
