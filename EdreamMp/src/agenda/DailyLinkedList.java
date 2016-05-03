package agenda;

import java.util.LinkedList;

public class DailyLinkedList<T> extends DailyCollection<T>{
	
	public DailyLinkedList(){
		super();
		this.setDailyEvents(new LinkedList<T>());
	}
}
