package Session_practice;

public class Child implements Parent {

	@Override
	public void name() {
		System.out.println("pooja");
	}

	@Override
	public void bank() {
		System.out.println("ICICI");
		
	}

	@Override
	public void accno() {
		System.out.println("1234");
		
	}
	public static void main(String[] args) {
		
Parent p=new Child();
p.name();
p.bank();
p.accno();

System.out.println(Parent.a);
System.out.println(Parent.sre);
	}

	

}
