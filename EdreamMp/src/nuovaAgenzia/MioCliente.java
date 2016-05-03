package nuovaAgenzia;

import java.util.List;

import provaAgenzia.Cliente;
import provaAgenzia.Persona;
import provaAgenzia.Prenotazione;

public class MioCliente implements Cliente {

	private List<Prenotazione> listaPrenotazioni;
	private Persona datiPersonali;
	
	public MioCliente(Persona nuovaPersona) {
		datiPersonali = nuovaPersona;
	}
	
	public MioCliente(Persona nuovaPersona, List<Prenotazione> prenotazioni) {
		datiPersonali = nuovaPersona;
		listaPrenotazioni = prenotazioni;
	}
}
