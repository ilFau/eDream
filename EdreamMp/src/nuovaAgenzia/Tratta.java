package nuovaAgenzia;

public class Tratta implements Cloneable{
	
	private String stazionePartenza;
	private String stazioneArrivo;
	
	public Tratta(String stazionePartenza, String stazioneArrivo) {
		this.stazionePartenza = stazionePartenza;
		this.stazioneArrivo = stazioneArrivo;
	}

	public String getStazionePartenza() {
		return stazionePartenza;
	}

	public String getStazioneArrivo() {
		return stazioneArrivo;
	}

	public Tratta clone() {
		try {
			return (Tratta) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
	
}
