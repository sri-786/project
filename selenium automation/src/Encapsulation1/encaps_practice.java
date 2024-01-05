package Encapsulation1;

class encap{
	
	
	private String name;
	private int num;
	encap(String pname,int pnum){
		this.name=pname;
		this.num=pnum;
	}
	public void re() {
		System.out.println(name+"  "+num);
	}
	public String get_mrt() {
		return name;
	}
	public int get_mrt1() {
		return num;
	}
	
	public void name_cl(String name) {
		this.name=name;
	}
	public void num_cl(int num) {
		this.num=num;
	}
}


public class encaps_practice {

	public static void main(String[] args) {
		encap en=new encap("Sri",12);
		en.re();
		en.num_cl(1234);
		en.name_cl("Srikanth");
System.out.println(en.get_mrt());
System.out.println(en.get_mrt1());
	}

}
