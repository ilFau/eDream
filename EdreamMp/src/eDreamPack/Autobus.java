package eDreamPack;

import java.io.Serializable;

public interface Autobus extends Serializable {
	
	public String getName();
	public void setName(String name);
	public int getFreeSeats();
	//true posto assegnato, false posto gi� occupato;
	public boolean assignSeat(int numeroSeat);
	
	
}