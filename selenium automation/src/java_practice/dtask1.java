package java_practice;

class Parrent_practice{
	private String name;
	private int age;
	
	Parrent_practice(String Pname,int Page){
		this.name=Pname;
		this.age=Page;
	}
	
	
	
public void print_result_parrent() {
		
		System.out.println("name value: "+name);
		System.out.println("age :"+age);
		
	}
}


class Child_practice extends Parrent_practice {
	
	private String address;
	private int salary;
	
	Child_practice(String Cname,int Cage,String Caddress,int Csalary){
		
		super(Cname, Cage);
		this.address=Caddress;
		this.salary=Csalary;
		
	}
	
	public void print_result() {
		
		System.out.println("address value: "+address);
		System.out.println("salary :"+salary);
		
	}
}

public class dtask1 {

	
	public static void main(String[] args) {
		
		Child_practice c=new Child_practice("Srikanth",24,"guntur",15000);
		c.print_result_parrent();
		c.print_result();
		
	}

}
