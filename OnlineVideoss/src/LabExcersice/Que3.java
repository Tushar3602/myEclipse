package LabExcersice;

class Customer{
	String name;
	int age;
	int contactNumber;
	boolean memberShip = false;
	float rewardPoint;
	
	Customer(String name,int age ,int contactNumber){
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
	}
	Customer(String name, int age, int contactNumber, boolean memberShip, Float rewardPoint){
		  this.name = name;
		  this.age = age;
		  this.contactNumber = contactNumber;
		  this.memberShip = memberShip;
		  this.rewardPoint = rewardPoint;
	}
 }
  class Que3{ 
	public static void main(String[] args) {
		Customer a1 = new Customer("Floyd Mayweather",40,9988776);
		Customer a2 = new Customer("Khabib",30,9966885,true,29.0f);
		
		System.out.println("customer name is: "+a1.name);
		System.out.println("age is: "+a1.age);
		System.out.println("Contact no. "+a1.contactNumber);
	    System.out.println(" customer name is: "+a2.name+", age is: "+a2.age+" ,Contact no. "+a2.contactNumber+" membership is: "+a2.memberShip+", reward points are: "+a2.rewardPoint);

	}

}
