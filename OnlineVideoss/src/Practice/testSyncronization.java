package Practice;
class Table{
	void printTable(int n) {
		for(int i=1;i<6;i++)
			System.out.println(n*i);
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}	
class MyThread1 extends Thread{
	Table t;
		MyThread1(Table t){
			this.t=t;
		}
		public void run() {
			t.printTable(5);
		}
}
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}
public class testSyncronization {
	public static void main(String[] args) {
		Table o =new Table();
		MyThread1 t1=new MyThread1(o);
		MyThread2 t2=new MyThread2(o);
		t1.start();
		t2.start();
	}
}
