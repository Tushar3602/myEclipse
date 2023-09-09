
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo {

	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<>();
		map.put("myName"," Navin");
		map.put("actor", "John");
		map.put("ceo", "Maria");
		map.put("actor", "Chris");
		
		Set<String> Keys = map.keySet();
		
		for(String key : Keys)
		{
			System.out.println(key+ " " +map.get(key));
		}
	}

}
