
interface Abc
{
	void show();
}
//Anonymous class in Interface
//class implementor implements Abc  
//{
	//public void show ()
	//{
		//System.out.println("Anything");
	//}
//}

public class InterfaceDemoA 
{
	
	public static void main(String[] args) 
	{
		Abc obj = new Abc()
				{
			public void show ()
			{
				System.out.println("Anything");
			}
		};
		obj.show();
	}
	
}
