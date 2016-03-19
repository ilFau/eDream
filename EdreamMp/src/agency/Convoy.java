package agency;

import java.util.*;

public class Convoy implements Vehicles {
    private List<Vehicles> convoyList;
    
    public Convoy(){
	this.convoyList = new LinkedList<Vehicles>();
    }
    public void addVeicle(Vehicles newVehicle){
	convoyList.add(newVehicle);
    }
    public void removeVeicle(Vehicles rmvVehicle){
	convoyList.remove(rmvVehicle);
    }
    
    @Override
    public String getName() {
	return "Convoglio di "+convoyList.size()+" mezzi.";
    }

    @Override
    public int getSeats() {
	int totalSeats=0;
    	Iterator<Vehicles> vehicleQueue = convoyList.iterator();
    	while(vehicleQueue.hasNext()){
    	    Vehicles thatVehicle = vehicleQueue.next();
    	    totalSeats= totalSeats+thatVehicle.getSeats();  
    	}
	return totalSeats;
    }

    @Override
    public List<Customers> getPassengers() {
	List<Customers> listOfPassenger = new LinkedList<Customers>();
	Iterator<Vehicles> vehicleQueue = convoyList.iterator();
    	while(vehicleQueue.hasNext()){
    	    Vehicles thatVehicle = vehicleQueue.next();
    	    listOfPassenger.addAll(thatVehicle.getPassengers());  
    	}
    	return listOfPassenger;
    }

    @Override
    public List<Employed> getCrew() {
	List<Employed> listOfEmployees = new LinkedList<Employed>();
	Iterator<Vehicles> vehicleQueue = convoyList.iterator();
    	while(vehicleQueue.hasNext()){
    	    Vehicles thatVehicle = vehicleQueue.next();
    	    listOfEmployees.addAll(thatVehicle.getCrew());  
    	}
	return listOfEmployees;
    }

}
