 class Emp
 {
	 int eid;
	 int salary;
	 static String ceo;
	
	 
	 static  		// when you load a class
	 {
		 ceo = "Larry";
		 System.out.println("in static");
	 }
	 
	 public Emp()   // when you create an object  
	 {
		 eid=1;
		 salary=3000;
		 System.out.println("in constructor");
	 }
	 
	 public void show()
	 {
		 System.out.println(eid + " : " + salary + " : " + ceo);
	 }	
 }
public class StaticDemo {

	public static void main(String[] args) {
		{
			Emp navin = new Emp();
			/*navin.eid = 8;
			navin.salary = 4000;
			Emp.ceo = "Mahesh";
			
			Emp rahul = new Emp();
			rahul.eid = 9;
			rahul.salary = 5000;
			Emp.ceo = "Mahesh";
			
			Emp.ceo = "Nikita";
			*/
			Emp rahul = new Emp();
			
			navin.show();
			rahul.show();
		}

	}

}
