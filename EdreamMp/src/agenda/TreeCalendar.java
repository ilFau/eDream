package agenda;

import java.util.TreeMap;

import dateTime.Date;

public class TreeCalendar extends MappedCalendar {
	
	public TreeCalendar(){
		this.setMyMap(new TreeMap<Date, Daily<?>>());
	}
	
}
