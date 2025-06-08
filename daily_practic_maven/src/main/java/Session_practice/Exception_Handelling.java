package Session_practice;

public class Exception_Handelling {

	public static void main(String[] args) {
	String str=null;
	int a=10;
	int b=20;
	
	System.out.println("multiplication of a&b : "+a*b);
	
	try {
		System.out.println("Lets handel the Exception");
	int i=str.length();
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		
	}
	finally {
		System.out.println("Exception handeled");
	}
	
	System.out.println("Remaining code Exicuted ");
	
	System.out.println("addition of a&b : "+(a+b));
	}

}
