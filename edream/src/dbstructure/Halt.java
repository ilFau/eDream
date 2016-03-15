package dbstructure;

import java.util.ArrayList;
import java.util.Iterator;

public class Halt extends Stage {
    private String location;
    
    public Halt(String location, int period){
	super(period, 0);
	this.setLocation(location);
    }

    public String getLocation() {
	return location;
    }

    public void setLocation(String location) {
	this.location = location;
    }

    @Override
    public Iterator<String> getTour(){
	ArrayList<String> falseList = new ArrayList<String>();
	falseList.add(this.getName());
	return falseList.iterator();
    }
    
    public String getName() {
	return location;
    }
}
