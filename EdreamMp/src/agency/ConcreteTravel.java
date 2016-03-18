package agency;

import java.util.*;

public class ConcreteTravel implements Travel {
    private String name;
    private Employees supervisor;
    private Veicles fleet;
    private List<Travel> myStep;
    
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
    
    public Employees getSupervisor() {
	return this.supervisor;
    }

    public void setSupervisor(Employees employer) {
	this.supervisor = employer;
    }

    public Veicles getFleet() {
	return fleet;
    }

    public void addFleet(Veicles fleet) {
	this.fleet = fleet;
    }
    
}
