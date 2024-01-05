//3.Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
//Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
//implement the respective methods to handle deposits and withdrawals for each account type.


package java_practice;

abstract class BankAccount {
	abstract void deposit(int a);

	abstract void withdraw(int b);
}

class SavingAccount extends BankAccount {
	void deposit(int a) {
		System.out.println("Deposite the saving  account amount : "+a);

	}

	void withdraw(int b) {
		System.out.println("Withdraw the saving  account amount : "+b);
	}

}

class CurrentAccount extends BankAccount {
	void deposit(int a) {
		System.out.println("Deposite the current account amount : "+a);

	}

	void withdraw(int b) {
		System.out.println("Withdraw the current account amount : "+b);
	}

}

public class Abstract_cls3 {
	public static void main(String[] args) {
		BankAccount saving = new SavingAccount();
		saving.deposit(15000);
		saving.withdraw(10000);

		BankAccount current = new CurrentAccount();
		current.deposit(20000);
		current.withdraw(15000);

	}
}

