package newphase;

import java.util.Scanner;

public class askNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = -1;
		do {if(number !=-1 ){
			System.out.println("Cube is" + (number * number * number));

		}
		System.out.println("Enter the number");
			number = sc.nextInt();

		} while (number >= 0);
		System.out.println("Thanks!");
	}
}
