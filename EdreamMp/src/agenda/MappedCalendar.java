package agenda;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import dateTime.Date;


public abstract class MappedCalendar implements Calendar {
	private Map<Date, Daily<?>> myDate;
	
	@Override
	public Daily<?> getDaily(Date date){
		return this.getMyMap().get(date);
	}
	@Override
	public void setDaily(Date date, Daily<?> daily){
		this.getMyMap().put(date, daily);
	}
	@Override
	public void remove(Date date){
		this.getMyMap().remove(date);
	}
	
	@Override
	public Iterator<Date> iterator(){
		Collection<Date> collectionDate = this.getMyMap().keySet();
		return collectionDate.iterator();
	}
	@Override
	public Collection<Daily<?>> allDaily(){
		return this.getMyMap().values();
	}
	
	public Map<Date, Daily<?>> getMyMap() {
		return myDate;
	}
	public void setMyMap(Map<Date, Daily<?>> myDate) {
		this.myDate = myDate;
	}
}
