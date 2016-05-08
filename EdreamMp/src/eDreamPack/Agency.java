package eDreamPack;

import java.util.Collection;

import agenda.Calendar;

public interface Agency {

	String getName();
	Collection<Customer> allCustomers();
	Collection<Employees> allEmployees();
	Collection<Autobus> veiclesPark();
	boolean addCustomers(Customer newCustomer);
	boolean addEmployees(Employees newEmployees);
	boolean addVeicles(Autobus newAutobus);
	Calendar activeTravel();
	Calendar archiviedTravel();
	
}