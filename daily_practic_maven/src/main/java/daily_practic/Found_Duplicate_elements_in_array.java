package daily_practic;

import java.util.HashSet;

public class Found_Duplicate_elements_in_array {

	public static void main(String[] args) {
		String str[]= {"java","paython","c++","java"};
		boolean flage=false;
//		for(int i=0; i<=str.length-1; i++) {
//			for(int j=i+1; j<=str.length-1; j++) {
//				if(str[i]==str[j]) {
//					System.out.println("element founnd :"+str[i]);
//					flage=true;
//				}
//			}
//		}
//		if(flage==false) {
//		System.out.println("element not found");	
//		}
//		
		
		HashSet <String> sh=new HashSet();
		for(String a:str) {
			if(sh.add(a)==false) {
				System.out.println("elements is found :"+a);
				flage=true;
				
			}
			
			}if(flage==false) {
				System.out.println("not found");
		}

	}

}
