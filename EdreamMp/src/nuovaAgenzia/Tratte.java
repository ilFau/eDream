package nuovaAgenzia;

public class Tratte implements Cloneable{
	
	public Tratte clone() {
		try {
			return (Tratte) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
	
}
