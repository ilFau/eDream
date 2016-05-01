package nuovaAgenzia;

import java.util.Date;

public class Hostess extends Dipendente {

	private String Competenze;
	
	public Hostess(String nome, String cognome, Date annoNascita, String Competenze) {
		super(nome, cognome, annoNascita);
		this.Competenze = Competenze;
	}

}
