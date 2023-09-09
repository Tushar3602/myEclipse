package fix;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;

class Stud implements Comparable<Stud>
{
	int rolln,marks;
	String name;
	public Stud(int rolln, String name,int marks) {
		super();
		this.rolln = rolln;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [rolln=" + rolln + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTO(Stud s)
	{
		return marks >s.marks?1:-1;
	}
	@Override
	public int compareTo(Stud o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class CompareableDemo {

	public static void main(String[] args)
	{
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23,"Mukesh",55));
		studs.add(new Stud(24,"Mahesh",25));
		studs.add(new Stud(25,"Max",14));
		studs.add(new Stud(26,"Money",21));
		
		
		Collections.sort(studs,(i,j)->i.marks<j.marks?1:-1);
		
		for(Stud s : studs)
		{
			System.out.println(s);
		}
	}

}

