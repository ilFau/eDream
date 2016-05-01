package nuovaAgenzia;

import java.util.*;

public class ProdottoEffettivo extends Prodotto{

	private Date dataPartenza;
	private Date dataArrivo;
	
	public ProdottoEffettivo(Tratte tratta, List<Hostess> hostess, List<Autista> autisti, List<Autobus> autobus, Date dataPartenza, Date dataArrivo) {
		super(tratta, hostess, autisti, autobus);
		this.dataPartenza = (Date) dataPartenza.clone();
		this.dataPartenza = (Date) dataArrivo.clone();
	}

	public int NumPostiTotali () {
		Iterator<Autobus> iteratorAutobus = autobus.iterator();
		int tot = 0;
		Autobus tmpAutobus;
		while (iteratorAutobus.hasNext()) {
			tmpAutobus = iteratorAutobus.next();
			tot += tmpAutobus.getNumPosti();
		}
		return tot;
	}

	public Date getData() {
		return dataPartenza;
	}
	
}
