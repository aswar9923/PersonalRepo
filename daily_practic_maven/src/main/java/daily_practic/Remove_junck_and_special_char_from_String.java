package daily_practic;

public class Remove_junck_and_special_char_from_String {

	public static void main(String[] args) {
		String str="pooaja@Amol Aswar ###!@#$%^&*()";
		String ss=	str.replaceAll("[^a-zA-Z0-1 ]", "");
			
	System.out.println(ss);

	}

}
