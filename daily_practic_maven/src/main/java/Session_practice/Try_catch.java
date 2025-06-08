package Session_practice;

public class Try_catch {

	public static void main(String[] args) {
		int a=10;    //local v
		
		try {
			System.out.println(a/0);
		}
			
			
		

		catch(Exception e){
			e.printStackTrace();
			System.out.println(" Need msg :" +e.getMessage());

		}
		
		
//		catch(ArithmeticException e1) {
//			 System.out.println("Handle"+e1.getMessage());
//		}
		try {
			System.out.println(a/0);
		}
		
		finally{
			System.out.println("we can not divide by zero");
		}
		

	}

}
