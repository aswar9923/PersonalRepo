package daily_practic;

public class Reverse_string_by_StringBuffer_1{

	public static void main(String[] args) {
		 //concatination by StingBuffer..........
StringBuffer sb=new StringBuffer("pooja");
sb=new StringBuffer("p");
sb.append("amol");//..........mutable

System.out.println(sb);  //..................................concat by using StringBuffer method....append();

//Reverse string ......StringBuffer method 

 StringBuffer b=sb.reverse();
 System.out.println(b); //............mutable


	}

}
