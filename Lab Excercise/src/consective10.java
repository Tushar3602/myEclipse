import java.util.Scanner;
public class consective10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
 		for (int i = 0;   i < str.length() - 1;   i++) 
 		{ 
			if (str.charAt(i)==str.charAt(i + 1))
  			{
				continue; 
			} 
			sb.append(str.charAt(i));
		}
	sb.append(str.charAt(str.length() - 1));
	System.out.println("Modified String: "+sb.toString());
	}
}
