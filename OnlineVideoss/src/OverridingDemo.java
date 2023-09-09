
class AB 
{
	public void show()
	{
		System.out.println("in A ");
	}
	
}
class BC extends AB
{
	//	@override
	public void show()
	{
		
		System.out.println("in B");
	}
}	
class C extends AB{
	public void show()
	{
		System.out.println("in C");
	}
}
public class OverridingDemo {
//Compile time and runtime
	public static void main(String[] args) {
		
		AB obj1 = new BC(); 
		obj1.show();
		
		obj1 = new C();
		obj1.show();
		
	}

}
