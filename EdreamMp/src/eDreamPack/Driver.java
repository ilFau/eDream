package eDreamPack;

public abstract class Driver extends Employees {

	private String drivingLicense;
	
	public Driver(String name, String lastName, String fiscalCode,String drivingLicense) {
		super(name, lastName, fiscalCode);
		setDrivingLicense(drivingLicense);
	}

	public String getTipoPatente() {
		return drivingLicense;
	}	
	
	private void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	
	
}
