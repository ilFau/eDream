package testEDream;

import java.util.Date;

import eDreamPack.ActualProduct;

public class MyActualProduct extends ActualProduct{
	
	public MyActualProduct (MyProduct prodotto, Date partenza, Date arrivo, MyTeam squadra) {
		super(prodotto, partenza, arrivo, squadra);
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof MyActualProduct)){
			return false;
		}
		MyActualProduct prod = (MyActualProduct)obj;
		if(this.getProduct().equals(prod.getProduct())
				&& this.getDepartureDate().equals(prod.getDepartureDate())
				&& this.getArrivalDate().equals(prod.getArrivalDate())
				&& this.getTeamProduct().equals(prod.getTeamProduct())){
			return true;
		}
		return false;
	}
}
