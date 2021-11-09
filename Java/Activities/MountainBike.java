package activities;

public class MountainBike extends Bicycle{

	public int seatHeight;
	
	MountainBike(int gears, int currentSpeed,int sheight ){
		super(gears,currentSpeed);
		seatHeight = sheight;
	}
	
	public void setHeight(int height) {
	    seatHeight = height;
	}
	
	public void bicycleDesc() {
		System.out.println("The gears from child class "+gears+ "and Speed "+currentSpeed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
