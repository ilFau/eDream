package agencyPack;

public abstract class Hotel {

	public String Nome;
	public int numStelle;
	public int numTel;

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public String getNome() {
		return this.Nome;
	}

	public void setNumStelle(int numStelle) {
		this.numStelle = numStelle;
	}

	public int getNumStelle() {
		return this.numStelle;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public int getNumTel(){
		return this.numTel;
	}
}
