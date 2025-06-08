package Session_practice;

public class Contitue {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		
		for(int i :a) {
			if(i==50) {
				continue;
			}
			System.out.println(i);
		}
		

	}

}
