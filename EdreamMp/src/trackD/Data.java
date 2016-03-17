package trackD;

public abstract class Data {
	private String name, destination;
	private int distance, period;
	private Tour reference;
	
	public Data(){
		Tour reference = blankRef();
		this.setReference(reference);
	}
	
	public Data(Tour reference){
		this.setReference(reference);
	}
	
	protected abstract Tour blankRef();
	
	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination){
		this.destination = destination;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name){
		this.name = this.procedureName(name);
	}
	
	protected abstract String procedureName(String name);
	
	public int getPeriod(){
		return this.period;
	}
	public void setPeriod(int period){
		this.period = this.procedurePeriod(period);
	}
	
	protected abstract int procedurePeriod(int period);
	
	public int getDistance(){
		return this.distance;
	}
	public void setDistance(int distance){
		this.distance = this.procedureDistance(distance);
	}
	protected abstract int procedureDistance(int distance);

	protected Tour getReference() {
		return reference;
	}

	protected void setReference(Tour reference) {
		this.reference = reference;
	}
	
}
