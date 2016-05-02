package nuovaAgenzia;

import java.util.*;

public class Prodotto {

	protected Luogo partenza;
	protected Luogo arrivo;
	protected List<Hostess> hostess;
	protected List<Autista> autisti;
	protected List<Autobus> autobus;
	protected int quotaDefault;

	public Luogo getPartenza() {
		return partenza;
	}

	public Luogo getArrivo() {
		return arrivo;
	}

	public int getQuotaDefault() {
		return quotaDefault;
	}

	public Luogo getTratta() {
		return partenza;
	}

	public List<Hostess> getHostess() {
		return hostess;
	}

	public List<Autista> getAutisti() {
		return autisti;
	}

	public List<Autobus> getAutobus() {
		return autobus;
	}

	public Prodotto(Luogo partenza, Luogo arrivo, List<Hostess> hostess, List<Autista> autisti, List<Autobus> autobus,
			int quotaDefault) {
		this.partenza = partenza.clone();
		this.arrivo = arrivo.clone();
		this.hostess = hostess;
		this.autisti = autisti;
		this.autobus = autobus;
		this.quotaDefault = quotaDefault;
	}
}
