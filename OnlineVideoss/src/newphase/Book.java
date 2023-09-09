package newphase;

public class Book {
	private int noOfCopies;
	
	Book(int noOfCopies){
		this.noOfCopies=noOfCopies;
	}
	
	
	//void SetnoOfCopies(int noOfCopies) {
		//this.noOfCopies=noOfCopies;
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies>0)
		this.noOfCopies = noOfCopies;
		
	}
	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}
	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
	
	

	public static void main(String[] args) {
		Book ArtOfComputerProg =new Book(50);
		Book EffectiveJava = new Book(30);
		Book CleanCode = new Book(20);
		
		/*ArtOfComputerProg.setNoOfCopies(50);
		EffectiveJava.setNoOfCopies(30);
		CleanCode.setNoOfCopies(20);
		
		ArtOfComputerProg.decreaseNoOfCopies(10);
		EffectiveJava.increaseNoOfCopies(10);
		CleanCode.increaseNoOfCopies(20);
		*/
		System.out.println(ArtOfComputerProg.getNoOfCopies());
		System.out.println(EffectiveJava.getNoOfCopies());
		System.out.println(CleanCode.getNoOfCopies());
		
		
		

	}

}
