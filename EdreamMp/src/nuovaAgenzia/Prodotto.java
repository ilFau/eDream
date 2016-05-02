package nuovaAgenzia;

import java.util.*;

public class Prodotto {

	protected Tratta tratta;
	protected List<Hostess> hostess;
	protected List<Autista> autisti;
	protected List<Autobus> autobus;
	protected int quotaDefault;

	public int getQuotaDefault() {
		return quotaDefault;
	}

	public Tratta getTratta() {
		return tratta;
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

	public Prodotto(Tratta tratta, List<Hostess> hostess, List<Autista> autisti, List<Autobus> autobus, int quotaDefault) {
		this.tratta = tratta.clone();
		this.hostess = hostess;
		this.autisti = autisti;
		this.autobus = autobus;
		this.quotaDefault = quotaDefault;
	}
}
