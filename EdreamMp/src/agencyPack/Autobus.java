package agencyPack;

import java.io.Serializable;

public class Autobus implements Serializable {
	
	private String name;
	private int numSeats;
	
	public Autobus(String name, int numSeats) {
		this.setName(name);
		this.setNumSeats(numSeats);
	}
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getNumSeats() {
		return this.numSeats;
	}

	private void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}
	
	public String toString() {
		return (this.getName()+" "+this.getNumSeats());
	}
	
}