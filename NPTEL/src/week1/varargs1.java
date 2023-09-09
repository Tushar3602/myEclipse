package week1;

public class varargs1 {
	static void varargs1(int v[]) {
		System.out.println("Number of args: "+v.length+" \nElements: ");
		for(int x:v	)
			System.out.println(x+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,3,4,7,-9};
		int y[]= {2,5};
		int z[]= {};
		
		varargs1 (x);
		varargs1 (y);
		varargs1 (z);
		

	}

}
