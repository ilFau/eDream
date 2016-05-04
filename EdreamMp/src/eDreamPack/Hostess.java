package eDreamPack;

public class Hostess extends Employees {

	private String skills;
	
	public Hostess(String name, String lastName, String fiscalCode, String skills) {
		super(name, lastName, fiscalCode);
		this.skills = skills;
	}

	public String getSkills() {
		return skills;
	}
	
}