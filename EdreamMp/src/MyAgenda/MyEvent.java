package MyAgenda;

import calendar.Event;

public class MyEvent extends Event{
	
	private int numberOfPeople;
	
	public MyEvent (String nome, String descrizione, int numPersone) {
		this.setName(nome);
		this.setDescription(descrizione);
		this.numberOfPeople = numPersone;
	}
	
	public int setQuotaIscrizione (int rata) {
		return this.numberOfPeople*rata;
	}
	
}
