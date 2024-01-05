//Write a Java program to create an abstract class Animal with an abstract method called sound(). 
//Create subclasses Lion and Tiger that extend the Animal class and implement the sound()
//method to make a specific sound for each animal.

package java_practice;

abstract class Animal {
	abstract void sound(String a);
}

class Lion extends Animal {
	void sound(String a) {
		System.out.println("Lion  : "+a);
	}
	
}

class Tiger extends Animal {
	void sound(String a) {
		System.out.println("Tiger : "+a);

	}
}

class Abstract_cls1 {
	public static void main(String[] args) {
		Animal li = new Lion();
		Animal tg = new Tiger();
		li.sound("roar");
		tg.sound("growl");
		
	}
}




