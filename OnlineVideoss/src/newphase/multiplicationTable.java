package newphase;
//Method Overloading
public class multiplicationTable {
	static void tableOf() {
		tableOf(5);
		/*for(int i=1;i<=10;i++)
		{
			System.out.printf("%d * %d = %d",5,i,i*5).println();
		}*/
}
	static void tableOf(int n) {
		tableOf(n,1,10);
		/*for(int i=1;i<=10;i++)
		{
			System.out.printf("%d * %d = %d",n,i,i*n).println();
		}*/
}
	
	static void tableOf(int n,int x,int y) {
		for(int i=x;i<=y;i++)
		{
			System.out.printf("%d * %d = %d",n,i,i*n).println();
		}
	}
	
		
	public static void main(String[] args) {
		multiplicationTable table=new multiplicationTable();
		table.tableOf();
		//table.tableOf(7);
		//table.tableOf(7,5,15);
		

	}

}
