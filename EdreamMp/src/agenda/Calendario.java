package agenda;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

import java.util.Date;

public interface Calendario extends Iterable<Date>, Serializable {

	public Daily<?> getDaily(Date date);

	public void setDaily(Date date, Daily<?> daily);

	public void remove(Date date);

	public Iterator<Date> iterator();

	public Collection<Daily<?>> allDaily();
	
}