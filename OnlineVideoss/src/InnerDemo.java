/*
 * Inner class
 * Member class
 * Static class
 * Anonymous 
 */






class Outer 
{
		static int a;
		public void show()
		{
			
		}
		
		static class Inner // Outer$Inner.class
		{
			public void display()
			{
				System.out.println("in display");
			}
		}
}
public class InnerDemo {

	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
			
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
		
		

	}

}
