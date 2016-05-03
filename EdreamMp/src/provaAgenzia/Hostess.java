package provaAgenzia;

public class Hostess extends Employees {

	public Hostess returnType(){
		return this;
	}
	
	public String toString(){
		String tmpString = new String ("Sono l'hostess "+this.getName()+" ed il mio ID e` "+this.getID());
		return tmpString;
	}
	
}
