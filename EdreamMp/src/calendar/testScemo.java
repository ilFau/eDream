package calendar;

public class testScemo {

	public static void main(String[] args) {
		Date data = new Standard(1992, 6, 29);
		VisitorPrint userLang = new VisitorIT();
		data.printDate(userLang);
	}

}
