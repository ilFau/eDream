package provaAgenzia;

import java.util.*;

public abstract class ProdottoEffettivo {
	
	private Prodotto prodotto;
	private Date dataPartenza;
	private Date dataArrivo;
	private Troop oggetti;
	
	public Prodotto getProdotto() {
		return prodotto;
	}
	public Date getDataPartenza() {
		return dataPartenza;
	}
	public Date getDataArrivo() {
		return dataArrivo;
	}
	public Troop getOggetti() {
		return oggetti;
	}

	
	
}
