package LabExcersice;

import java.util.*;
class invalidFactorial extends Exception
{
	invalidFactorial(String S)
	{
		super(S);
	}
}
class factorial 
{
	static void Check(int N) throws invalidFactorial
	{
		int fact=1;
		if(N<0)
		{
			throw new invalidFactorial ("Invalid");
		}
		else
		{
			for(int i=1;i<=N;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial Is : "+fact);
		}
	}
}	
class factorial14
{
	public static void main(String arg[])
	{
		Scanner A=new Scanner(System.in);
		int N=A.nextInt();
		factorial B=new factorial();
		try
		{
			B.Check(N);
		}
		catch(Exception S)
		{
			System.out.println("Caught Exception "+S);
		}
	}
}
