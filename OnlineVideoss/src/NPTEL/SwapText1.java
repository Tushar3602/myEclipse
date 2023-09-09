package week1;
class SwapTest1{
public static void swap1(T x, T y){
	T temp;
	t =x;
	x =y;
	y =t;
}
public static void main(String args[]){
	Integer x = new Integer(99);
	Integer y = new Integer(66);
	System.out.println("x = " + x + "y = " + y);
	swap1(x, y);
	System.out.println("x = " + x + "  + y ="  + y);
	}
} 