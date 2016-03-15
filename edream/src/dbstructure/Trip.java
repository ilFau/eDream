package dbstructure;

import java.util.*;

public class Trip extends Stage {
    private String[] fromTo = new String[2];
    
    public Trip(String fromLocation, String toLocation, int distance, int period){
	super(period, distance);
	this.setFromTo(fromLocation, toLocation);
    }
    
    public void setFromTo(String from, String to){
	this.fromTo[0] = from;
	this.fromTo[1] = to;
    }
    public String getFrom(){
	return fromTo[0];
    }
    public String getTo(){
	return fromTo[1];
    }

    @Override
    public Iterator<String> getTour(){
	ArrayList<String> falseList = new ArrayList<String>();
	falseList.add(this.getName());
	return falseList.iterator();
    }
    
    public String getName() {
	return fromTo[0]+" - "+fromTo[1];
    }
    
}
