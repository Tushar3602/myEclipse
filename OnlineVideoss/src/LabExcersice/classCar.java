package LabExcersice;

public class classCar {

	class Engine{
		
	public	void start() {
			System.out.println("Engine Started");
		}
	}
		
	
	public static void main(String[] args) {
		classCar c= new classCar();
		classCar.Engine e = c.new Engine();
		e.start();

	}

}
 