package newphase;

public class MotorBike {
	private int speed;
	
	MotorBike(){
		this(5);
	}
	
	MotorBike(int speed){
		this.speed=speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
	if(speed>0)
		this.speed = speed;
	}
	public void increaseSpeed(int howMuch) {
		setSpeed( this.speed + howMuch);
	}
	public void decreaseSpeed(int howMuch)
	{
		setSpeed(this.speed-howMuch);
	}
	 public static void main(String[] args) {
			MotorBike ducati= new MotorBike(100);
			MotorBike honda= new MotorBike(200);
			MotorBike isuzu= new MotorBike();
			
			System.out.println(ducati.getSpeed());
			System.out.println(honda.getSpeed());
			System.out.println(isuzu.getSpeed());
			
		/*	ducati.start();
			ducati.setSpeed(50);
			System.out.println(ducati.getSpeed());
			honda.setSpeed(20);
			System.out.println(honda.getSpeed());
			
			ducati.speed=110;
			honda.speed=90;
			ducati.increaseSpeed(100);
			honda.increaseSpeed(100);
			ducati.decreaseSpeed(50);
			honda.decreaseSpeed(20);
			
			
			*/
			
		}


	

}
