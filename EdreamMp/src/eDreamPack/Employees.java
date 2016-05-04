package eDreamPack;

import java.util.*;

public abstract class Employees extends Person {

	private UUID myID;
	private boolean travelling = false;
	private List<ActualProduct> listWork;

	public Employees(String name, String lastName, String fiscalCode) {
		super(name, lastName, fiscalCode);
		this.setID();
		this.setTravelling(false);
		this.listWork = new LinkedList<ActualProduct>();
	}

	public List<ActualProduct> getListWork() {
		return listWork;
	}

	public boolean addNewWork(ActualProduct newWork) {
		try {
			listWork.add(newWork);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean removeOldWork (ActualProduct oldWork) {
		try {
			listWork.remove(oldWork);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private void setID() {
		this.myID = UUID.randomUUID();
	}

	public String getID() {
		return this.myID.toString();
	}

	private void setTravelling(boolean trueOrFalse) {
		this.travelling = trueOrFalse;
	}

	public boolean getTravelling() {
		return this.travelling;
	}

}