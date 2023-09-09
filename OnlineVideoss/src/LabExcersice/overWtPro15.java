package LabExcersice;

/*15. Write an application which will throw OverwtProductException if Product weight is 
above 60kg. (Use User defined exception)
*/
import java.util.Scanner;
class OverwtProductException extends Exception
{
	OverwtProductException(String S)
	{
		super(S);
	}
}
class overWtPro15
{
	static void Check(int W) throws OverwtProductException
	{
		if(W>60)
		{
			throw new OverwtProductException("Over Weight Product");
		}
		else
		{
			System.out.println("Product Approved");
		}
	}		
	public static void main(String []Args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Weight");
		int Weight= s.nextInt();
		try
		{
			Check(Weight);
		}
		catch(Exception E)
		{
			System.out.println("Caught Exception : "+E);
		}
	} 
}
