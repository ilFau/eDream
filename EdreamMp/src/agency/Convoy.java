package agency;

import java.util.*;

public class Convoy implements Veicles {
    private List<Veicles> convoyList;
    
    public Convoy(){
	this.convoyList = new LinkedList<Veicles>();
    }
    public void addVeicle(Veicles newVeicle){
	convoyList.add(newVeicle);
    }
    public void removeVeicle(Veicles rmvVeicle){
	convoyList.remove(rmvVeicle);
    }
    
    @Override
    public String getName() {
	return "Convoglio di "+convoyList.size()+" mezzi.";
    }

    @Override
    public int getSeats() {
	int totalSeats=0;
    	Iterator<Veicles> veicleQueue = convoyList.iterator();
    	while(veicleQueue.hasNext()){
    	    Veicles thatVeicle = veicleQueue.next();
    	    totalSeats= totalSeats+thatVeicle.getSeats();  
    	}
	return totalSeats;
    }

    @Override
    public List<Customers> getPassengers() {
	List<Customers> listOfPassenger = new LinkedList<Customers>();
	Iterator<Veicles> veicleQueue = convoyList.iterator();
    	while(veicleQueue.hasNext()){
    	    Veicles thatVeicle = veicleQueue.next();
    	    listOfPassenger.addAll(thatVeicle.getPassengers());  
    	}
    	return listOfPassenger;
    }

    @Override
    public List<Employees> getCrew() {
	List<Employees> listOfEmployees = new LinkedList<Employees>();
	Iterator<Veicles> veicleQueue = convoyList.iterator();
    	while(veicleQueue.hasNext()){
    	    Veicles thatVeicle = veicleQueue.next();
    	    listOfEmployees.addAll(thatVeicle.getCrew());  
    	}
	return listOfEmployees;
    }

}
