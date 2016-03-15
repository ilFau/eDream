package dbstructure;

import java.util.Iterator;

public abstract class Stage implements Travel {
    private int period;
    private int distance;
    
    public Stage(int period, int distance){
	this.setPeriod(period);
	this.setDistance(distance);
    }
    public Travel addStage(Travel stage){
	Tour newTour = new Tour("");
	newTour.addStage(this);
	newTour.addStage(stage);
	return newTour;
    }
    public abstract Iterator<String> getTour();
    
    public int getPeriod() {
	return period;
    }
    public void setPeriod(int period) {
	this.period = period;
    }
    public int getDistance() {
	return distance;
    }
    public void setDistance(int distance) {
  	this.distance = distance;
    }

}
