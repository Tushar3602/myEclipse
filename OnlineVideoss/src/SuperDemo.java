

class A 
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in A Int");
	}
}
class B extends A  
{
	public B()
	{
		super(5);
		System.out.println("in B");
	}
	public B(int i)
	{
		super(i);
		System.out.println("in B Int");
	}
}
public class SuperDemo 
{
	public static void main(String[] args) 
	{	
		B obj1 = new B();
		
	}

}
