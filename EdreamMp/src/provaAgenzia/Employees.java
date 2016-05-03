package provaAgenzia;

import java.util.*;

public abstract class Employees extends Person{

	private UUID myID;
	private boolean inViaggio = false;		

	public void setID() {
		 this.myID = UUID.randomUUID(); 	
	}
	
	public UUID getID() {
		return this.myID;
	}
	
	public void setInViaggio(boolean trueOrFalse){
		this.inViaggio = trueOrFalse;
	}
	
	public boolean getInViaggio() {
		return this.inViaggio;
	}
	
	public abstract Employees returnType();
	
	public abstract String toString();
}