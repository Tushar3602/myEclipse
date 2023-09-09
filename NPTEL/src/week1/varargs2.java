package week1;

public class varargs2 {
	static void varargs2(int ...v) {
		System.out.println("Number of arguments "+ v.length);
		for (int i:v)
			System.out.println(i +"");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varargs2 (9);
		varargs2 (1,-1,2,3,-5);
		varargs2 ();

	}

}
