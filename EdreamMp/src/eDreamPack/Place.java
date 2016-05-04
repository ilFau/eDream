package eDreamPack;

import java.util.*;

public abstract class Place {

	public String name;
	public List<Hotel> hotels;

	private void setName(String name) {
		this.name = name;
	}
	
	private String getName() {
		return this.name;
	}

	public List<Hotel> getHotels() {
		return this.hotels;
	}

	private void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	
}