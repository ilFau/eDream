package trackD;

public class DataPack extends Data {

	public DataPack(Tour reference) {
		super(reference);
	}

	@Override
	protected String procedureName(String name) {
		return name;
	}

	@Override
	protected int procedurePeriod(int period) {
		return period;
	}

	@Override
	protected int procedureDistance(int distance) {
		return distance;
	}

	@Override
	protected Tour blankRef() {
		return new TrackPack();
	}

}
