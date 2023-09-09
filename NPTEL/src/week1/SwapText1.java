package week1;


class SwapTest1{
public static void swap1(int  x,y){
	
	temp =x;
	x =y;
	y =temp;
}
public static void main(String args[]){
	Integer x = new Integer(99);
	Integer y = new Integer(66);
	System.out.println("x = " + x + "   y = " + y);
	swap1(x, y);
	System.out.println("x = " + x + "    y ="  + y);
	}
} 