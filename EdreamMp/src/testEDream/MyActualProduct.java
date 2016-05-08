package testEDream;

import java.util.Date;

import eDreamPack.ActualProduct;

public class MyActualProduct extends ActualProduct{
	
	public MyActualProduct (MyProduct prodotto, Date partenza, Date arrivo, MyTeam squadra) {
		super(prodotto, partenza, arrivo, squadra);
	}

}
