package trackD;

import java.util.LinkedList;

public class TrackPack implements Tour {
	private Data myData;
	private LinkedList<Tour> myTour;
	
	public TrackPack(Data data){
		this.setDataList(data);
	}
	public TrackPack(){
	}

	@Override
	public void addTour(Tour newtour) throws Exception {
		if(myTour == null){
			myTour = new LinkedList<Tour>();
		}
		if(!myTour.add(newtour)){
			throw new Exception("");
		}
	}

	@Override
	public void deleteTour(Tour tour) throws Exception {
		if(!myTour.remove(tour)){
			throw new Exception("");
		}
	}

	@Override
	public Data getDataList() {
		return this.myData;
	}

	public void setDataList(Data data) {
		this.myData = data;
	}

}
