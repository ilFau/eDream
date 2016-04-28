package vecchioCalendar;

public class VisitorUS implements VisitorPrint {

	@Override
	public void printDate(Date d) {
		System.out.print(d.getYear()+"-");
		System.out.print(d.getMonth()+"-");
		System.out.println(d.getDay());
	}

}
