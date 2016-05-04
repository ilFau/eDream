package eDreamPack;

import java.util.*;

public abstract class Team {
	
	private List<Hostess> hostess;
	private List<Driver> driver;
	private List<Autobus> autobus;
	
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
