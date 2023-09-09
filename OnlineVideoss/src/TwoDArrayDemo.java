
public class TwoDArrayDemo 
{
	
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		int b[] = {2,4,6,8};
		int c[] = {5,6,7,9};
		
		int d[][] = 
			{
				     	{1,2,3,4},			//Jagged Arrays
				     	{2,4,6,8},
				     	{5,6,7,9}	
		}; 
		
		for(int i=0;i<d.length;i++) //rows
		{
			for(int j=0;j<d[i].length;j++) //column
			{
				System.out.print("  " + d[i][j]);
			}
		}
		System.out.println();
	
	
	for(int k[] : d)
	{
		for(int l : k)
		{
			System.out.println(" " + l);
		}
	}
	
	}
}
