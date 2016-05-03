package provaAgenzia;

import java.util.Collection;

public interface Agenzia {

	public String getName();
	public Collection<Cliente> allCustomers();
	public Collection<Dipendenti> allEmployers();
	public Collection<Autobus> veiclesPark();
	public Calendar activeTravel();
	public Calendar archiviedTravel();
	
}