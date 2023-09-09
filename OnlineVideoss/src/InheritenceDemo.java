class Calculator
{
	public int add(int i , int j)
	{
		return i+j;
	}
}

class CalcAdv extends Calculator
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}
class CalcVeryAdv extends CalcAdv 
{
	public int multi(int i,int j)
	{
		return i*j;
	}
}


public class InheritenceDemo {
public static void main(String[] args) {
	CalcVeryAdv c1 = new CalcVeryAdv();
	int result1 = c1.add(5,4);
	int result2 = c1.sub(5,4);
	int result3 = c1.multi(5,4);
	
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
}
}
