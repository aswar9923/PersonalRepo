package practice_2;

import java.util.Arrays;

public class Contains_Substring_Split {

	public static void main(String[] args) {
		String str="welcom to@java_world";
		
		System.out.println(str.contains("elcom"));
		
		System.out.println(str.substring(0, 8));

		String st[]=str.split(" ");
		System.out.println(Arrays.toString(st)); //syso()st[0]
		
		String stt[]=st[1].split("@");
		System.out.println(Arrays.toString(stt));//stt[0]
		
		String sttt[]=stt[1].split("_");
		System.out.println(Arrays.toString(sttt));
		
		System.out.println(st[0]);
		System.out.println(stt[0]);
		System.out.println(sttt[0]);
		System.out.println(sttt[1]);
		
	}

}
