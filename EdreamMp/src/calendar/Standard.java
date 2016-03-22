package calendar;

public class Standard implements Date {

	private int year, month, day;

	Standard(int year, int month, int day) {
		this.setYear(year);
		this.setDay(day);
		this.setMonth(month);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public void printDate(VisitorPrint v) {
		v.printDate(this);
	}

}
