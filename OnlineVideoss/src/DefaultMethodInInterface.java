
@FunctionalInterface
interface Demo
{
	void abc();
	default void show()
	{
		System.out.println("in show");
	}
}

class DemoImp implements Demo
{
	public void abc()
	{
		System.out.println("in abc");
	}
}
public class DefaultMethodInInterface
{
	public static void main(String[] args)
	{
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();
	}
}
