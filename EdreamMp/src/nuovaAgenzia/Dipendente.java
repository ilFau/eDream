package nuovaAgenzia;

import java.util.*;

public abstract class Dipendente {
	
	protected String nome;
	protected String cognome;
	protected Date annoNascita;
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public Date getAnnoNascita() {
		return annoNascita;
	}
	
	public Dipendente (String nome, String cognome, Date annoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = (Date) annoNascita.clone();
	}
	
}
