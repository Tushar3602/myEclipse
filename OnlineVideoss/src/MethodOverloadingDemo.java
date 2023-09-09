
class Casio1
{
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j ,int k)
	{
		System.out.println(i+j+k);
	}
	public void add (double i,double j)
	{
		System.out.println(i+j);
	}
}
public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Casio1 obj = new Casio1();
		obj.add(5,2);
		
		obj.add(2, 3, 5);
		
		obj.add(5.8, 7.5);
	}
}
