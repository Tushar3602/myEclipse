package Practice;

public class threadDemo implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		threadDemo m1=new threadDemo();
		Thread t1 = new Thread(m1);
		t1.start();
		
	}

}
