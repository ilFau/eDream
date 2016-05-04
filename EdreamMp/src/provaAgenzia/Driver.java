package provaAgenzia;

import java.util.*;

public abstract class Driver extends Employees {

	private String drivingLicense;
	
	public Driver(String name, String lastName, String fiscalCode,String drivingLicense) {
		super(name, lastName, fiscalCode);
		this.drivingLicense = drivingLicense;
	}

	public String getTipoPatente() {
		return drivingLicense;
	}	
	
	
	
}
