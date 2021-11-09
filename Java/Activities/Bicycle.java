package activities;

public class Bicycle implements BicycleOperations , BicycleParts{
	
	public int gears;
    public int currentSpeed;
	
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    
    public void applyBrake(int speed) {
        currentSpeed -= speed;
        System.out.println("Current speed: " + currentSpeed);
    }
	
    public void speedUp(int speed) {
        currentSpeed += speed;
        System.out.println("Current speed: " + currentSpeed);
    }
    
	 
	public void bicycleDesc() {
		
		System.out.println("The num of gears "+gears+" and Speed is "+currentSpeed);
		
	}
	

}
