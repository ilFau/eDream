package calendar;

public class VisitorIT implements VisitorPrint {

	@Override
	public void printDate(Date d) {
		System.out.print(d.getDay()+"-");
		System.out.print(d.getMonth()+"-");
		System.out.println(d.getYear());
	}

}
