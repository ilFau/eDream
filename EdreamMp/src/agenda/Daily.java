package agenda;

import java.io.Serializable;
import java.util.Collection;

public interface Daily<T> extends Serializable, Cloneable {
	
	public void addEvent(T event);
	
	public void removeEvent(T event);
	
	public Collection<T> getDailyEvents();
	
	public void setDailyEvents(Collection<T> myEvents);
	
	public boolean equals(Object other);
	
	public Daily<T> clone() throws CloneNotSupportedException;
	
}
