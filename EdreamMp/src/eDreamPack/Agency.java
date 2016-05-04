package eDreamPack;

import java.util.Collection;

import agenda.Calendario;

public interface Agency {

	public String getName();
	public Collection<Client> allCustomers();
	public Collection<Employees> allEmployers();
	public Collection<Autobus> veiclesPark();
	public Calendario activeTravel();
	public Calendario archiviedTravel();
	
}