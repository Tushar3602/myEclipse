
interface Writer
{
	void write();
}

class Pen implements Writer
{
	public void write()
	{
		System.out.println("Im a Pen");
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("Im a Pencil");
	}
}

class Kit 
{
	public void doSomthing(Writer p)
	{
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args)
	{
		Kit K = new Kit();	
		Writer p = new Pen();
		
		Writer pc = new Pencil();
		
		K.doSomthing(pc);
		

	}

}
