package daily_practic;

public class Searching_an_elements_array_lenear_search {

	public static void main(String[] args) {
		int a[]= {4,2,3,5,6};
		int c=2;
		boolean b =false;
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]==c) {
				System.out.println("present the element :"+c);
				b=true;
			}
			
		}
			
		if(b==false) {
			System.out.println("not found :"+c);
		}
		

	}

}
