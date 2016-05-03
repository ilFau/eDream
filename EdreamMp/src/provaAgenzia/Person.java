package provaAgenzia;

public abstract class Person {
	
	private String name;
	private String lastName;
	private String fiscalCode;
	
	public String getName(){
		return this.name;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getFiscalCode() {
		return this.fiscalCode;
	}

}