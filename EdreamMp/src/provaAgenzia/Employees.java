package provaAgenzia;

import java.util.*;

public abstract class Employees extends Person {

	protected UUID myID;
	protected boolean travelling = false;
	protected List<Product> listWork;

	public Employees(String name, String lastName, String fiscalCode) {
		this.name = name;
		this.lastName = lastName;
		this.fiscalCode = fiscalCode;
		this.setID();
		this.travelling = false;
		this.listWork = new LinkedList<Product>();
	}

	public Iterator<Product> getListWork() {
		return listWork.iterator();
	}

	private void addNewWork(Product newWork) {
		listWork.add(newWork);
	}

	protected void setID() {
		this.myID = UUID.randomUUID();
	}

	public String getID() {
		return this.myID.toString();
	}

	protected void setTravelling(boolean trueOrFalse) {
		this.travelling = trueOrFalse;
	}

	public boolean getTravelling() {
		return this.travelling;
	}

}