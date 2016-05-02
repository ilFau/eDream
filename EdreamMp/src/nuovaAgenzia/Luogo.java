package nuovaAgenzia;

public class Luogo implements Cloneable{
	
	private String nome;
	
	public Luogo(String nome) {
		this.nome = nome;
	}

	public String getStazionePartenza() {
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public Luogo clone() {
		try {
			return (Luogo) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
	
}
