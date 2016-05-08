package eDreamPack;

public class Driver extends Employees {

	private String drivingLicense;
	
	public Driver(String name, String lastName, String fiscalCode,String drivingLicense) {
		super(name, lastName, fiscalCode);
		this.setDrivingLicense(drivingLicense);
	}

	public String getTipoPatente() {
		return drivingLicense;
	}	
	
	private void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	@Override
	public String added() {
		return this.getTipoPatente();
	}
	
}
