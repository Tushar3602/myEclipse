
class Calc
{
	int num1;   	//variables 
	int num2;
	int result;
	
	public void perform()  // Methods
	{
		result = num1 + num2 ;
	}
	
}
public class ObjectDemo {
	public static void main(String[] args)
	{
		Calc obj = new Calc();
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.perform();
		
		System.out.println(obj.result);
		
		
	}

}
