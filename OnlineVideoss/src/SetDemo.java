import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) 
	{
		Set<Integer> values = new TreeSet<>();
		System.out.println(values.add(87));
		System.out.println(values.add(47));
		System.out.println(values.add(78));
		System.out.println(values.add(69));
		
		for(int i : values)
		{
			System.out.println(i);
		}
			

	}

}
