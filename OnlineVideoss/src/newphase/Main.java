package newphase;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter number 1:");
		int number1 = sc.nextInt();
		System.out.println("Enter number 2:");
		int number2 = sc.nextInt();
		
		System.out.println("Choices Available");
		System.out.println("1 - add");
		System.out.println("2 - Subtract");
		System.out.println("3 - multipy");
		System.out.println("4 - division");
		System.out.println("5 - Exit");
		System.out.println("Enter your choice:-");
		int choice = sc.nextInt();
		
		do {
		System.out.println("First number is:-" + number1);
		System.out.println("second number is:-"+ number2);
		
		System.out.println("Choice:"+ choice);
		
		basicCalculator(number1, number2, choice);
		}
		while(choice ==5);
	}

	private static void basicCalculator(int number1, int number2, int choice) {
		
		switch(choice) {
		case 1 : System.out.println("the addition of no.1 & 2 is:-"+(number1+number2));
				break;
		case 2 : System.out.println("the substraction of 1 & 2 is:-"+(number1-number2));
				break;
		case 3 : System.out.println("the multiplication of 1 & 2 is:-"+(number1*number2));
				break;
		case 4 : System.out.println("the division of 1 & 2 is"+(number1/ number2));
				break;
		case 5 : System.out.println("Exit");
				break;
		default: System.out.println("error");
				break;

		}
		
//		if(choice==1) {
//		}
//		 else if (choice==2){
//		 }
//		 else if(choice==3) {
//		 }
//		 else if(choice==4){
//		 }
//		 else{
//		 }
	}

}
