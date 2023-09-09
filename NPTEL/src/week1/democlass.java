package week1;

class DemoClass {
	// Defining a generic method to print any data type 
	<T>void genericPrint (T t) {
	System.out.println (t);
	}
	public static void main(String[] args) {
		DemoClass aObj = new DemoClass() ; // Creating an object of the class DemoClass
		aObj.genericPrint(101); // Calling generic method with int argument
		aObj.genericPrint("Joy with Java"); // Calling generic method with String 
		aObj.genericPrint(3.1412343); // Calling generic method with double
	}
	} 