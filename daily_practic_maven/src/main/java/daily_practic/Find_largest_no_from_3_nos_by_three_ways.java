package daily_practic;

public class Find_largest_no_from_3_nos_by_three_ways {

	public static void main(String[] args) {
	int a=10, b=20,c=30;
	
//	if((a>b) &&(a>b)) {
//		System.out.println("a is a largest no");
//	}
//	else if((b>a) &&(b>c)){
//		System.out.println("b is a largest no");
//	}
//	else {
//		System.out.println("c is a largest no");
//	}
	
	int largest_1=a>b?a:b;
	//System.out.println(largest_1);
	int largest_2=c>largest_1?c:largest_1;
	System.out.println(largest_2);
	
	
	}

}
