package Session_practice;

public class Valuese_assinge_to_the_variables {
	int a;
	double d;
	String str;
	float f;
	
	Valuese_assinge_to_the_variables(int b,double e,String str1,float f2){
a=b;
d=e;
str=str1;
f=f2;
System.out.println(a+d+f+" "+str);
	}
	
	void m1(int b,double e,String str1,float f2) {
		a=b;
		d=e;
		str=str1;
		f=f2;
		System.out.println(a+d+f+" "+str);
		
	}
	
	public static void main(String[] args) {
		Valuese_assinge_to_the_variables v=new Valuese_assinge_to_the_variables(1,1.1,"pooja",5.5f);
		v.m1(2,2.2,"pooja",2.7f);
		
		v.a=1;
		v.d=0.0;
		v.str="pooja";
		v.f=7.7f;
		System.out.println(v.a+v.d+v.f+" "+v.str);
		System.out.println(1+0.0+7.7f+" "+"pooja");
	}

}
