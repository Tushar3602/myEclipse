package newphase;

public class myNum {

	private int number;

	public myNum(int number) {
		this.number=number;
		
		}

	public boolean isPrime() {
		for(int i=2 ;i<=number-1;i++) {
		if(number % i==0)
		{
		return false;
		}
	 }
		return true;
	}

	public int sumUptoN() {
		int sum=0;
		for(int i=1;i<=number;i++) {
			sum=sum+i;
		}
		return sum;
	}

	public int sumOfDivisiors() {
		int sum = 0;
		for(int i=2 ;i<number-1 ;i++ ) {
			if(number % i == 0) {
				sum = sum+i;
			} 	
	}
		return sum  ;
	
	}

	public void printNoTringle() {
			for(int i=1;i<=number;i++) {
				for(int j=1;j<=i;j++) {
				System.out.print(j +" ");
			} 
			System.out.println();
			}
	}
}
