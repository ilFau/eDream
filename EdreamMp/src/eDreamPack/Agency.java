package eDreamPack;

import java.util.Collection;

import agenda.Calendar;

public interface Agency {

	public String getName();
	public Collection<Client> allCustomers();
	public Collection<Employees> allEmployers();
	public Collection<Autobus> veiclesPark();
	public Calendar activeTravel();
	public Calendar archiviedTravel();
	
}