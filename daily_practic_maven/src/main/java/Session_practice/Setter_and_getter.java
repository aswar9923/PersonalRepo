package Session_practice;

public class Setter_and_getter {
	
private int account_no;

private String name;

public void setacc(int account_no) {
	this.account_no=account_no;
	
}
public int getacc() {
	return account_no;
}

public void setname(String name) {
	this.name=name;
}
public String getname() {
	return name;
	
}

	public static void main(String[] args) {
		
		Setter_and_getter sg=new Setter_and_getter();
		sg.setacc(100);
		System.out.println(sg.getacc());
		
		sg.setname("pooja");
		System.out.println(sg.getname());
		
	}

}
