package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
	
	Plane(int maxPassengers){
		this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<String>();
	   		
	}

	public void onboard(String passanger){
		this.passengers.add(passanger);
	}
	
	public Date takeOff() {
		this.lastTimeLanded = new Date();
		return lastTimeLanded;
		
	}
	
	public void land() {
		this.lastTimeLanded=new Date();
		this.passengers.clear();
	}
	
	public Date getLastTimeLanded() {
		return this.lastTimeLanded;
	}
	
	public List<String> getPassesngers() {
	return passengers;	
	}
}
