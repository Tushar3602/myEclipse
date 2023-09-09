package newphase;

public class addingTwoNumbers {
	static void additionOf(int a,int b,int c){
		System.out.println(a + b + c);
	}
	static void additionOf(int a,int b){
		System.out.println(a + b);
	}
	static  int sumOf(int a,int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		additionOf(2,3,5);
		additionOf(2,3);
		;
		System.out.println(sumOf(5,8));
	}

}
