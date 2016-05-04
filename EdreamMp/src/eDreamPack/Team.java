package eDreamPack;

import java.util.*;

public abstract class Team {
	
	private List<Hostess> hostess;
	private List<Driver> autisti;
	private List<Autobus> autobus;
	
	public void addHostess (Hostess nuovaHostess) {
		this.hostess.add(nuovaHostess);
	}
	
	public void addAutisti (Driver nuovoAutista) {
		this.autisti.add(nuovoAutista);		
	}
	
	public void addAutobus (Autobus nuovoAutobus) {
		this.autobus.add(nuovoAutobus);
	}
	
	public Iterator<Hostess> getHostess() {
		return hostess.iterator();
	}
	
	public Iterator<Driver> getAutisti() {
		return autisti.iterator();
	}
	
	public Iterator<Autobus> getAutobus () {
		return autobus.iterator();
	}
	
//	public int numeroPostiDisponibili() {
//		Iterator<Autobus> iteratorAutobus = getAutobus();
//		Autobus autobusAttuale = iteratorAutobus.next();
//		int totCapienza = autobusAttuale.getCapienza();
//		while (iteratorAutobus.hasNext()) {
//			autobusAttuale = iteratorAutobus.next();
//			totCapienza += autobusAttuale.getCapienza();
//		}
//		return totCapienza;
//	}
	
	

}
