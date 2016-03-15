package dbstructure;

import java.util.Iterator;
import java.util.LinkedList;

public class Tour implements Travel{
    private LinkedList<Travel> stages;
    
    public Tour(String name){
	stages = new LinkedList<Travel>();
    }
    public Travel addStage(Travel newStage) {
        this.stages.add(newStage);
        return this;
    }
    /* public Travel removeStage(Travel stage) {
        this.stages.remove(stage);
        if (stages.size() == 1){
            return stages.poll();
        }
        return this;
    }
    */
    
    public int getDistance() {
	Iterator<Travel> listOfStage = stages.iterator();
	Travel current;
	int total = 0;
	while(listOfStage.hasNext()){
	    current = listOfStage.next();
	    total = total+current.getDistance();
	}
	return total;
    }

    public int getPeriod() {
	Iterator<Travel> listOfStage = stages.iterator();
	Travel current;
	int total = 0;
	while(listOfStage.hasNext()){
	    current = listOfStage.next();
	    total = total+current.getPeriod();
	}
	return total;
    }

    public Iterator<String> getTour() {
	Iterator<Travel> listOfStage = stages.iterator();
	LinkedList<String> tourIterator = new LinkedList<String>();
	Iterator<String> current;
	while(listOfStage.hasNext()){
	    current = listOfStage.next().getTour();
	    while (current.hasNext()){
		tourIterator.add(current.next());
	    }
	}
	return tourIterator.iterator();
    }

    
}
