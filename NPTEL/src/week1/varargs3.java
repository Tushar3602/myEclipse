package week1;

public class varargs3 {
public static void varargs3(Object ... obj) {
	for(Object o :obj)
		System.out.println(""+o);
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varargs3 (2,"String",2.3,true);
		varargs3 ();
		varargs3 (1,4,5,9,15);
		}
}
