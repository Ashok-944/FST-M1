package Activity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Cars {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeStarted;
    private Date lastTimeParked;

    // Constructor
    public Cars(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<String>();
    }
    public boolean onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }
    
    public Date start() {
        lastTimeStarted = new Date();
        return lastTimeStarted;
    }
    public void park() {
        lastTimeParked = new Date();
        passengers.clear();
    }
    public Date getLastTimeParked() {
        return lastTimeParked;
    }
    public List<String> getPassengers() {
        return new ArrayList<String>(passengers); // Return a copy to preserve encapsulation
    }
}

//Main Method
public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Cars car = new Cars(4);
        car.onboard("Alice");
        car.onboard("Bob");
        car.onboard("Charlie");
        Date startTime = car.start();
        System.out.println("Car started at: " + startTime);
        System.out.println("Passengers: " + car.getPassengers());
        Thread.sleep(5000);
        car.park();
        System.out.println("Car parked at: " + car.getLastTimeParked());
    }
}

