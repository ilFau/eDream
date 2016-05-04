package eDreamPack;

import java.util.*;

public abstract class Employees extends Person {

	private UUID myID;
	private boolean travelling = false;
	private List<Product> listWork;

	public Employees(String name, String lastName, String fiscalCode) {
		super(name, lastName, fiscalCode);
		this.setID();
		this.setTravelling(false);
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