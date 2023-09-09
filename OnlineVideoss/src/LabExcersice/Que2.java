package LabExcersice;

public class Que2 {
	
	 void area(int side) {
		System.out.println("Area Of Square is - "+side*side);
	}
	void area(int length,int height) {
		System.out.println("Area of Rectangle - "+length*height);
	}
	public static void main(String[] args) {
		Que2 ar=new Que2();
		ar.area(5);
		ar.area(5, 10);
		
		

	}

}
