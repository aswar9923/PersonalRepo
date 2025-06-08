package my_practice;

public class Constuctor_overloading {
	int ss,dd,ff;
	 Constuctor_overloading(){
		 ss=dd=ff=1;
		 
	 }
	
	 Constuctor_overloading(int s,int d,int f){
		 ss=s;dd=d;ff=f;
		 
	 }
	 Constuctor_overloading(int a,int c){ 
		 this.ss=a; this.dd=c;
	 }
	 void m1(){
		 System.out.println(ss+dd+ff);
		
	}
	 
	 void m1(int a,int c){
		 System.out.println(a+c);
		
		}
	
	public static void main(String[] args) {
		 Constuctor_overloading cns=new  Constuctor_overloading();
             cns.m1();
             System.out.println("*************");
             Constuctor_overloading cns1=new  Constuctor_overloading(1,2,3);
             cns1.m1();
             System.out.println("*************");
             cns1.m1(3,6);
            
	}

}
