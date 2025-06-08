package daily_practic;

import java.util.Arrays;

public class Searching_an_elements_array_binary_search {
//Elements must be a sorted order
	public static void main(String[] args) {
		int a[]= {1,2,4,5,6,7};
		boolean b=false;
		
		int l=0;
		int h=a.length-1;
		int srchelement=7;
		
	//case 1:	
		while(l<=h) {
			int m=l+h/2;  
			
			if(srchelement==a[m]) { 
				System.out.println("element found :"+a[m]);
				b=true;
				break;
			}
			if(a[m]<srchelement) {
				l=m-1;  
				
			}
			if(a[m]>srchelement) {
				
			h=m+1;   
			}
		}
	if(b==false) {
		System.out.println("element not found :");
	}
	//System.out.println(0+6/2);
	
	//case 2;
	//System.out.println(Arrays.binarySearch(a, srchelement));
	//..........it will writen a index of an element
	}
	
	
}
