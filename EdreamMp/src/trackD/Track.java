package trackD;

public class Track implements Tour {
	private Data myData;
	
	public Track(Data data){
		this.setDataList(data);
	}
	
	public void setDataList(Data data) {
		this.myData = data;
	}

	public Track(){
	}

	@Override
	public void addTour(Tour newtour) throws Exception {
		throw new Exception("Operazione non consentita");
	}

	@Override
	public void deleteTour(Tour tour) throws Exception {
		throw new Exception("Operazione non consentita");
	}

	@Override
	public Data getDataList() {
		return this.myData;
	}

}
