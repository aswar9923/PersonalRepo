package practice_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Local_2 {
	int a;
	String str;
	int b;
	public Local_2 (){
		this(1,"amol");
		System.out.println("it is default constructor");
		
	 } 
	public Local_2 (int p,String ss ){
		this(2,"pooja",3);
		 a=p;
		 str=ss;
		 
		 System.out.println("it is second constructor :"+""+a+""+ss);
		 
	 }
	public Local_2 (int p,String ss,int c){
		this("aswar");
		 a=p;
		 str=ss;
		 b=c;
		 System.out.println("it is third constructor :"+""+p+c+""+ss);
	 }
	public Local_2 (String v){
		
		 str=v;
		 System.out.println("it is fourth constructor :"+""+v);
	 }
	public static void main(String[] args) {
		Local_2 L=new Local_2();
	
	
	}
}

//  for(int i=0; i<=a.length-1; i++)