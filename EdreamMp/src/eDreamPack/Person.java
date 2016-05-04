package eDreamPack;

public abstract class Person {
	
	private String name;
	private String lastName;
	private String fiscalCode;
	
	public Person(String name, String lastName, String fiscalCode){
		this.setName(name);
		this.setLastName(lastName);
		this.setFiscalCode(fiscalCode);
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getFiscalCode() {
		return fiscalCode;
	}
	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


}