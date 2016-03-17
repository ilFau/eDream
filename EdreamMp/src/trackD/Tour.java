package trackD;

public interface Tour {
	public void addTour(Tour newtour) throws Exception;
	public void deleteTour(Tour tour) throws Exception;
	public Data getDataList();
	
}
