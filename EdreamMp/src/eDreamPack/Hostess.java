package eDreamPack;

public class Hostess extends Employees {

	private String skills;
	
	public Hostess(String name, String lastName, String fiscalCode, String skills) {
		super(name, lastName, fiscalCode);
		setSkills(skills);
	}

	public String getSkills() {
		return skills;
	}
	
	private void setSkills (String skills) {
		this.skills = skills;
	}
	
}