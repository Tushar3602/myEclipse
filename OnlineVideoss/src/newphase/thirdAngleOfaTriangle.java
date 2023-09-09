package newphase;

public class thirdAngleOfaTriangle {
	static int  thirdAngleOf(int a,int b) {
		int c = 180 - (a+b);
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(thirdAngleOf(40,40) );
	}

}
