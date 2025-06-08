package Session_practice;

public class Cunstructor_by_thise_calling_statement {

	Cunstructor_by_thise_calling_statement (){
		this(10,20);
		System.out.println("thise is a default cunstuctor");
		
		
	}
	
	Cunstructor_by_thise_calling_statement (int a,int b){
		this("pooja","amol");
		System.out.println(a+b);
	}
	Cunstructor_by_thise_calling_statement (String str,String str1){
		this(20,1.1);
		System.out.println(str+str1);
	}
	Cunstructor_by_thise_calling_statement (int c,double d){
		
		System.out.println(c+d);
	}
	public static void main(String[] args) {
		Cunstructor_by_thise_calling_statement c=new Cunstructor_by_thise_calling_statement();

	}

}
