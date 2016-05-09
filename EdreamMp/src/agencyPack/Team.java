package agencyPack;

import java.util.*;

import people.Driver;
import people.Hostess;

public abstract class Team {
	
	private List<Hostess> hostess;
	private List<Driver> driver;
	private List<Autobus> autobus;
	
	public Team () {
		this.hostess = new LinkedList<Hostess>();
		this.driver = new LinkedList<Driver>();
		this.autobus = new LinkedList<Autobus>();
	}
	
	public void addHostess (Hostess nuovaHostess) {
		this.hostess.add(nuovaHostess);
	}
	
	public void addDriver (Driver newDriver) {
		this.driver.add(newDriver);		
	}
	
	public void addAutobus (Autobus newAutobus) {
		this.autobus.add(newAutobus);
	}
	
	public List<Hostess> getHostess() {
		return this.hostess;
	}
	
	public List<Driver> getDriver() {
		return this.driver;
	}
	
	public List<Autobus> getAutobus () {
		return this.autobus;
	}	

}
