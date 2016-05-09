package testEDream;

import eDreamPack.Autobus;

public class MyAutobus implements Autobus {

	private String name;
	private int numSeats;
	
	public MyAutobus(String name, int numSeats) {
		this.setName(name);
		this.setNumSeats(numSeats);
	}
	
	@Override
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
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
