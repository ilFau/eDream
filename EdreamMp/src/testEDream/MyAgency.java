package testEDream;

import java.util.*;
import agenda.Calendar;
import eDreamPack.*;

public class MyAgency implements Agency {

	private String name;
	private Collection<Customer> customers;
	private Collection<Employees> employees;
	private Collection<Autobus> autobus;
	private Calendar agenda;
	
	public MyAgency (String nome) {
		this.setName(nome);
		this.customers = new LinkedList<Customer>();
		this.employees = new LinkedList<Employees>();
		this.autobus = new LinkedList<Autobus>();
		this.agenda = null;
	}
	
	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public Collection<Customer> allCustomers() {
		return customers;
	}

	@Override
	public Collection<Employees> allEmployees() {
		return employees;
	}

	@Override
	public Collection<Autobus> veiclesPark() {
		return autobus;
	}

	@Override
	public boolean addCustomers(Customer newCustomer) {
		try {
			customers.add(newCustomer);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean addEmployees(Employees newEmployees) {
		try {
			employees.add(newEmployees);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean addVeicles(Autobus newAutobus) {
		try {
			autobus.add(newAutobus);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public Calendar activeTravel() {
		return agenda;
	}

	@Override
	public Calendar archiviedTravel() {
		return null;
	}

}
