package genericalProduct;

import agencyPack.Place;
import people.Team;

public abstract class Product {
	
	private Place departure;
	private Place arrival;
	private Team team;
	
	public Product (Place departure, Place arrival, Team team) {
		this.setDeparture(departure);
		this.setArrival(arrival);
		this.setTeam(team);
	}
	
	public Place getDeparture (){
		return this.departure;
	};
	public Place getArrival () {
		return this.arrival;
	};
	public Team getTeam () {
		return this.team;
	}
	private void setDeparture(Place departure) {
		this.departure = departure;
	}
	private void setArrival(Place arrival) {
		this.arrival = arrival;
	}
	private void setTeam(Team team) {
		this.team = team;
	};
	
	
	
}