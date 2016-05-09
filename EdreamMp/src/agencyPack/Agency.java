package agencyPack;

import java.util.Collection;
import java.util.LinkedList;

import agenda.Calendar;
import people.Customer;
import people.Employees;

public abstract class Agency {

	private String name;
	private Collection<Customer> customers;
	private Collection<Employees> employees;
	private Collection<Autobus> autobus;
	private Calendar agenda;

	public Agency (String nome) {
		this.setName(nome);
		this.customers = new LinkedList<Customer>();
		this.employees = new LinkedList<Employees>();
		this.autobus = new LinkedList<Autobus>();
		this.agenda = null;
	}
	
	private void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Collection<Customer> allCustomers() {
		return customers;
	}

	public Collection<Employees> allEmployees() {
		return employees;
	}

	public Collection<Autobus> veiclesPark() {
		return autobus;
	}

	public boolean addCustomers(Customer newCustomer) {
		try {
			customers.add(newCustomer);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean addEmployees(Employees newEmployees) {
		try {
			employees.add(newEmployees);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean addVeicles(Autobus newAutobus) {
		try {
			autobus.add(newAutobus);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Calendar activeTravel() {
		return agenda;
	}

	public Calendar archiviedTravel() {
		return agenda;
	}

}