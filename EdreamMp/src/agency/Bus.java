package agency;

import java.util.*;

public class Bus implements Veicles {
    private String name;
    private List<Employees> crew;
    private List<Customers> passengers;
    private int seats;
    
    public Bus(Bus prototype){
	this.name = prototype.getName();
	this.seats = prototype.getSeats();
	this.passengers = new ArrayList<Customers>(this.seats);
    }
    
    public Bus(String name, int seats){
	this.name = name;
	this.seats = seats;
    }
    @Override
    public String getName() {
	return this.name;
    }

    @Override
    public int getSeats() {
	return this.seats;
    }

    @Override
    public List<Customers> getPassengers() {
	return passengers;
    }

    @Override
    public List<Employees> getCrew() {
	return this.crew;
    }

}
