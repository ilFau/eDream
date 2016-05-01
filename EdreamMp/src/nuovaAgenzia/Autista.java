package nuovaAgenzia;

import java.util.Date;

public class Autista extends Dipendente {

	private String tipoPatente;
	
	public Autista(String nome, String cognome, Date annoNascita, String tipoPatente) {
		super(nome, cognome, annoNascita);
		this.tipoPatente = tipoPatente;
	}

}
