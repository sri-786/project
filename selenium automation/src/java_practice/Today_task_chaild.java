package java_practice;

public class Today_task_chaild extends Today_task_parent {
private int number;
private int id;

Today_task_chaild(String name, int age,int number,int id){
	super(name,age);
	this.number=number;
	this.id=id;
}
public void method2() {
	System.out.println("Number :"+number);
	System.out.println("Id :"+id);
}
}
