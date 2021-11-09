package activities;

public class Car {
	String color="Grey";
	String transmission="Manual";
	int make=2014;
	int tyres;
	int doors;
	
	Car()
	{
		tyres=4;
		doors=4;
		
	}
	
	public void displayCharacteristics() {
		System.out.println(color);
		System.out.println(transmission);
		System.out.println(make);
		System.out.println("Number of tyres " +tyres);
		System.out.println("Number of doors " +doors);
	}
	
	public void accelerator() {
		System.out.println("This car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}

	
}
