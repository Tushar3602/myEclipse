package LabExcersice;
/*6. Consider a class Loan and derive subclasses CarLoan, HomeLoan, EducationLoan. Add 
members and methods accordingly. Override the method setCommissionRate();*/
abstract class loan{
	abstract void setCommissionRate(int a);
	
class CarLoan extends loan{
	void setCommissionRate(int a) {
		System.out.println("Commission Rate of Car Loan"+((a*10)/100));
	}
class HomeLoan extends loan{
	void setCommissionRate(int a) {
		System.out.println("Commission Rate of HomeLoan"+((a*15)/100));
	}
class EducationLoan extends loan{
	void setCommissionRate(int a) {
		System.out.println("Commission Rate of EducaionLoan"+((a*20)/100));
	}
}
}


	
}

public class que6 {

	public static void main(String[] args) {
		
		int amount =400000;
		CarLoan c = new CarLoan();
		HomeLoan h = new Homeloan();
		EducationLoan e = new EducationLoan();
		c.setCommissionRate(amount);
		h.setCommissionRate(amount);
		e.setCommissionRate(amount);	
				
	}

	}

}
