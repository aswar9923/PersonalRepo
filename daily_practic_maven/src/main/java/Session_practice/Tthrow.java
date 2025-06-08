package Session_practice;

import java.util.Scanner;

public class Tthrow {

	public static void main(String[] args) throws ValideException,InvalideException  {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age ");
		int age=sc.nextInt();

		if(age>18) {
			throw new ValideException("person is eligeble for vote");
		}
		
		else if(age<18) {
			throw new InvalideException ("person is not eligeble for vote");
		}
		
		else {
			System.out.println("you will go for vote");
		}
	
	}

}
