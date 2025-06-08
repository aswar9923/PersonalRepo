package Session_practice;

public class Abstract_class_2 extends Abstract_class  {
	
	@Override
	public void firstname() {
	System.out.println("pooja");
		
	}

	@Override
	public void bankname() {
		System.out.println("ICICI");
		
	}

	@Override
	public int accno() {
		System.out.println(10000);
		return 10000;
	}
	
	public static void main(String[] args) {
		Abstract_class ac=new Abstract_class_2();
		ac.firstname();
		ac.bankname();
		ac.accno();
	}

	
}