
class Calx
{
	public int add(int ... n)	//Variable Length Arguments
	{
		int sum=0;
		for(int i : n)
		{
			sum = sum + i;
		}
		return sum;		
	}
}
public class VarargsDemo
{
	public static void main(String[] args) {
		Calx obj = new Calx();
		System.out.println(obj.add(4,5,6,4));
	}
}
