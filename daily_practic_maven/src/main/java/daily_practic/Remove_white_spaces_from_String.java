package daily_practic;

public class Remove_white_spaces_from_String {

	public static void main(String[] args) {
		String str="    pooja    Amol    Aswar   "; //........applicable only for it
		
	//String str=" pooja Amol Aswar ";...................not applicable for it
	
	String g=str.replaceAll("\\s ", ""); //not remove the only one space, it remove if string contain more than one space at a time 
	System.out.println(g);
	

	}

}
