import java.io.BufferedReader;
import java.io.InputStreamReader;

//BuffedReadear
//Scanner

public class UserInput {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println("Enter a Number");
		
		
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))	)
		{
			n = Integer.parseInt(br.readLine()); //45
		}
		/*catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			br.close();
		}*/	
		System.out.println(n);
	}

}
