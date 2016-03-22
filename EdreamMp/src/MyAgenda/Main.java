package MyAgenda;

import calendar.*;

public class Main {

	public static void main(String[] args) {
		VisitorPrint sonoItaliano = new VisitorIT();
		Agenda miaAgenda = new Agenda(sonoItaliano);
		MyEvent eventoZero = new MyEvent("ciao mamma", "evento di prova del calendar", 30);
		Date allaData = new Standard (1992,2,3);
		miaAgenda.aggiungiEvento(eventoZero, allaData);
		miaAgenda.stampaEventiAllaData(allaData);
		System.out.println("la quota d'iscrizione all'evento è: "+ eventoZero.setQuotaIscrizione(10));
	}

}
