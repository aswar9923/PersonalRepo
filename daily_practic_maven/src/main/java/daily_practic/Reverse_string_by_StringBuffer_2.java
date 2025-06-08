package daily_practic;

public class Reverse_string_by_StringBuffer_2 {

	public static void main(String[] args) {
String str="pooja is my name";
		
		StringBuffer sb=new StringBuffer (String.valueOf(str));
		System.out.println(sb.reverse());
		
		StringBuilder sd=new StringBuilder(str);
		//sd.append(str);..........................we can do by this way or by directly
		//when we use append() no need to specify str in StringBuffer
		System.out.println(sd.reverse());

	}

}
