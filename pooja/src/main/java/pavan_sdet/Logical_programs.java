package pavan_sdet;

public class Logical_programs {

	public static void main(String[] args) {
		for(int i=1;i<5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int k=5; k>i; k--) {
				System.out.print(" ");
			}
			for (int L=5; L>i; L--) {
				System.out.print(" ");
			}
			for(int M=1; M<=i; M++) {
				System.out.print("*");
			}
	System.out.println();
		}
		for(int a=5;a>=1; a--) {
			for (int b=1; b<=a; b++) {
				System.out.print("*");
			}
			for(int c=5; c>a; c--) {
					
				System.out.print(" ");
			}
			for (int d=5; d>a; d--) {
				System.out.print(" ");
			}
			for(int e=1; e<=a; e++) {
				System.out.print("*");
			}
	System.out.println();
		}
	}

}
