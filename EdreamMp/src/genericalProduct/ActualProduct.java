package genericalProduct;

import java.util.*;

import agencyPack.Team;

public class ActualProduct {
	
	private Product product;
	private Date departureDate;
	private Date arrivalDate;
	private Team teamProduct;
	
	public ActualProduct(Product product, Date departureDate, Date arrivaDate, Team teamProduct) {
		this.setProduct(product);
		this.setDepartureDate(departureDate);
		this.setArrivalDate(arrivaDate);
		this.setTeamProduct(teamProduct);
	}
	
	private void setProduct(Product product) {
		this.product = product;
	}

	private void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}



	private void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}



	private void setTeamProduct(Team teamProduct) {
		this.teamProduct = teamProduct;
	}



	public Product getProduct() {
		return product;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public Team getTeamProduct() {
		return teamProduct;
	}

	
	
}
