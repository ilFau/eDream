package provaAgenzia;

public abstract class Person {
	
	protected String name;
	protected String lastName;
	protected String fiscalCode;
	
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