package Session_practice;

public class Logical_program {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=0; i<=4; i++) {
			for(int k=4; k>=i; k--) {
				System.out.print(" ");
				
			}
			for(int j=0; j<=i; j++) {
				count++;
				System.out.print(count);
				
			}
			
			System.out.println();
		}

	}

}
