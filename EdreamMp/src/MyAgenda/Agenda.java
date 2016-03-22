package MyAgenda;

import calendar.*;

public class Agenda {
	
	private VisitorPrint chiSono;
	private Calendar<MyEvent> mioCalendario = new Calendar<MyEvent>();
	
	public Agenda(VisitorPrint v) {
		this.chiSono = v;
	}
	
	public void aggiungiEvento (MyEvent nuovoEvento, Date data) {
		mioCalendario.addEvent(data, nuovoEvento);
	}
	
	public void stampaEventiAllaData (Date d) {
		d.printDate(chiSono);
		// stampa eventi della data
	}

}
