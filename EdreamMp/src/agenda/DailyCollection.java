package agenda;

import java.util.Collection;
import java.util.List;

public abstract class DailyCollection<T> implements Daily<T>{

	private List<T> myEvents;

	public DailyCollection() {
		super();
	}

	@Override
	public void addEvent(T event) {
		this.getDailyEvents().add(event);
	}

	@Override
	public void removeEvent(T event) {
		this.getDailyEvents().remove(event);
	}

	@Override
	public Collection<T> getDailyEvents() {
		return myEvents;
	}

	@Override
	public void setDailyEvents(Collection<T> myEvents) {
		this.myEvents.clear();
		this.myEvents.addAll(myEvents);
	}

	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Daily<?>)){
			return false;
		}
		Daily<?> theOther = (Daily<?>)other;
		Collection<?> hisCollection = theOther.getDailyEvents();
		return this.getDailyEvents().equals(hisCollection);
	}
	
	@Override
	public Daily<T> clone() throws CloneNotSupportedException{
		try{
			Daily<T> clone = null;
			clone = (Daily<T>)super.clone();
			Collection<T> hisList = clone.getDailyEvents();
			hisList.addAll(this.getDailyEvents());
			return clone;
		} catch (CloneNotSupportedException e ){return null;}
	}
}