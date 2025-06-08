package pavan_sdet;

public class Remove_junck_char_or_special_char_from_string {
	
public static void main(String[] args) {
	
	String str="w#$%el--co@me";
	
	//str.replace("#", "");
	
	System.out.println(str.replace("#", "").replace("$", "").replace("%", "").replace("--", "").replace("@", ""));
	
}
}
