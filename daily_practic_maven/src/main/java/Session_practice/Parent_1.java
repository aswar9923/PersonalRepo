package Session_practice;

public interface Parent_1 {
	int a=10;
	String str="pooja";
	  void m1();
	  static void m2() {
		  System.out.println(str);
		  
	  }
	  default  void m3() {
		  System.out.println(a);
		  
	  }

}
