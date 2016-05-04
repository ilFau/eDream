package eDreamPack;

import java.io.Serializable;

public interface Autobus extends Serializable {
	
	public String getName();
	void setName(String name);
	public int getNumSeats ();
	void setNumSeats (int numSeats);
	
}