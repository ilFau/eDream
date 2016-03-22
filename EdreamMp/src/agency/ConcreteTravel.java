package agency;

import java.util.*;

public class ConcreteTravel implements Travel {
    private String name;
    private Employed supervisor;
    private Vehicles fleet;
    private List<Travel> myStep; //da sostituire con la classe delle tappe.
    
    @Override
    public void getTour() {
	// TODO Auto-generated method stub
    }

    @Override
    public void addTour() {
	// TODO Auto-generated method stub
    }

    @Override
    public String getName() {
	return this.name;
    }

    @Override
    public void setName(String name) {
	this.name = name;
    }

    @Override
    public double getAmount() {
	// TODO Auto-generated method stub
	return 0;
    }
    
    public Employed getSupervisor() {
	return this.supervisor;
    }

    public void setSupervisor(Employed employer) {
	this.supervisor = employer;
    }

    public Vehicles getFleet() {
	return fleet;
    }

    public void addFleet(Vehicles fleet) {
	this.fleet = fleet;
    }
    
}
