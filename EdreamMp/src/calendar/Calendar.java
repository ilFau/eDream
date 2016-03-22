package calendar;

import java.util.*;

public class Calendar<E extends Event> {

	Map<Date, List<E>> dateList;
	Comparator<Date> cronological = new Cronological();

	public Calendar() {
		dateList = new TreeMap<Date, List<E>>(cronological);
	}

	public void addEvent(Date date, E event) {
		List<E> listOfEvent = dateList.get(date);
		if (listOfEvent == null) {
			listOfEvent = this.createTheListForKey(date);
		}
		listOfEvent.add(event);
	}

	private List<E> createTheListForKey(Date date) {
		List<E> listOfEvent = createListOfEvent();
		dateList.put(date, listOfEvent);
		return listOfEvent;
	}

	private List<E> createListOfEvent() {
		return new ArrayList<E>();
	}

}
