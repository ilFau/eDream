package testEDream;

import eDreamPack.Place;
import eDreamPack.Product;
import eDreamPack.Team;

public class MyProduct extends Product {

	public MyProduct(Place departure, Place arrival, Team team) {
		super(departure, arrival, team);
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof MyProduct)){
			return false;
		}
		MyProduct prod = (MyProduct)obj;
		if(this.getDeparture().equals(prod.getDeparture())
				&& this.getArrival().equals(prod.getArrival())
				&& this.getTeam().equals(prod.getTeam())){
			return true;
		}
		return false;
	}

}
