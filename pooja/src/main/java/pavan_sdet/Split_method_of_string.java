package pavan_sdet;
import java.util.Arrays;
public class Split_method_of_string {

	public static void main(String[] args) {
		String str1="abc,123@xyz";
		
		String a[]=str1.split(",");
		System.out.println(Arrays.toString(a));
		
		String b[]=a[1].split("@");
		System.out.println(Arrays.toString(b));
		
System.out.println(a[0]);
System.out.println(b[0]);
System.out.println(b[1]);
	}

}
