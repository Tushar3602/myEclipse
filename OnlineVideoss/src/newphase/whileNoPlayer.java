package newphase;

public class whileNoPlayer {

	private int limit;

	public whileNoPlayer(int limit) {
		this.limit = limit; 
	}

	public void printSquaresUptoLimit() {
		int i=1;
		while(i*i<limit) {
			System.out.print(i * i +" ");
			i++;
		}
	}

	public void printCubesUptoLimit() {
		int i=1;
		while(i*i*i<limit) {
			System.out.print(i * i * i+" ");
			i++;
		}		
	}
	

}
