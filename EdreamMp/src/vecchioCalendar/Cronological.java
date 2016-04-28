package vecchioCalendar;

import java.util.Comparator;

public class Cronological implements Comparator<Date> {

	@Override
	public int compare(Date o1, Date o2) {
		int difference = compareNumber(o1.getYear(), o2.getYear());
		if (difference != 0) {
			return difference;
		} else {
			difference = compareNumber(o1.getMonth(), o2.getMonth());
		}
		if (difference != 0) {
			return difference;
		} else {
			difference = compareNumber(o1.getDay(), o2.getDay());
		}
		return difference;
	}

	private int compareNumber(int first, int second) {
		if (first > second) {
			return 1;
		}
		if (first < second) {
			return -1;
		}
		return 0;
	}
}
