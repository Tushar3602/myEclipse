
class Printer 
{
	public void show(Number i)
	{
		System.out.println(i);
	}
}
public class AbstractDemoUse 
{
	public static void main(String[] args) 
	{
		Printer obj = new Printer();
		obj.show(4.5f);
	}
}
