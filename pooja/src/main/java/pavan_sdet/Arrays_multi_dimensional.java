package pavan_sdet;

public class Arrays_multi_dimensional {

	public static void main(String[] args) {
		int a[][]=new int [3][2];
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		for (int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a[i].length-1; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
