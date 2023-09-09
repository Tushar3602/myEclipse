
interface DemoA
{
	int num = 8;
	void abc();
	
	static void show()
	{
		System.out.println("hi");
	}
}
class DemoImp implements DemoA
{
	public void abc()
	{
		num = 9;
			
	}
}
public class StaticMethodInInterface {

	public static void main(String[] args) 
	{
		DemoA.show();

	}

}
