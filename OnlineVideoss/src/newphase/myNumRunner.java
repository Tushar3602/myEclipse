package newphase;

public class myNumRunner {
	

	public static void main(String[] args) {
		myNum number=new myNum(5);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);
		
		int sum = number.sumUptoN();
		System.out.println("sumUptoN "+ sum);
		
		int sumOfDivisors=number.sumOfDivisiors();
		System.out.println("sumOfDivisiors " + sumOfDivisors);
		
		number.printNoTringle();
		
	}

}
