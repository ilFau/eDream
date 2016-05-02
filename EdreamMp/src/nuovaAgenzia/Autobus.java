package nuovaAgenzia;

public class Autobus {

	private String targa;
	private int numPosti;

	public String getTarga() {
		return targa;
	}

	public int getNumPosti() {
		return numPosti;
	}

	public Autobus(String targa, int numPosti) {
		this.targa = targa;
		this.numPosti = numPosti;
	}

}
