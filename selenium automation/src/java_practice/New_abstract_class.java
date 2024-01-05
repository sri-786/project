package java_practice;

abstract class New_class {
abstract int srikanth();
abstract String pavan();
abstract void venkatesh(String a);
}
class Ram extends New_class{
	int srikanth(){
		return 1234;
		
	}
	String pavan() {
		return "Nasana";
	}
	void venkatesh(String a) {
		System.out.println(a);
	}
}

public class New_abstract_class{
	public static void main(String[] args) {
		New_class cc=new Ram();
		int r=cc.srikanth();
		System.out.println(r);
		System.out.println(cc.pavan());
		cc.venkatesh("N");
	}
}