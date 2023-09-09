package LabExcersice;
//9. Create an abstract class 'Bank' with an abstract method 'getBalance'. Rs.100, Rs.150 and Rs.200 are deposited in banks A, B and C respectively.
//'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
//Call this method by creating an object of each of the three classes. 

 abstract class Bank{
	 abstract void getBalance();
}
class BankA extends Bank{
	int a=0;
	void Deposit(int N)
	{
		a+=N;
	}
	void getBalance()
	{	
		System.out.println("Balance = "+a);
	}	
	
}class BankB extends Bank{
	int b=0;
	void Deposit(int N)
	{
		b+=N;
	}
	void getBalance()
	{	
		System.out.println("Balance = "+b);
	}	
}
class BankC extends Bank{
	int c=0;
	void Deposit(int N)
	{
		c+=N;
	}
	void getBalance()
	{	
		System.out.println("Balance = "+c);
	}	
class q9Bank{
public static void main(String[] args)
{
	BankA A=new BankA();
	BankB B=new BankB();
	BankC C=new BankC();
	A.Deposit(100);
	B.Deposit(150);
	C.Deposit(200);
	A.getBalance();
	B.getBalance();
	C.getBalance();	
}
}