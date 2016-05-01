package nuovaAgenzia;

import java.util.*;

public class Prodotto {

	protected Tratte tratta;
	protected List<Hostess> hostess;
	protected List<Autista> autisti;
	protected List<Autobus> autobus;
	protected Quota quotaDefault;

	public Quota getQuotaDefault() {
		return quotaDefault;
	}

	public void setQuotaDefault(Quota quotaDefault) {
		this.quotaDefault = quotaDefault;
	}

	public Tratte getTratta() {
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

	public Prodotto(Tratte tratta, List<Hostess> hostess, List<Autista> autisti, List<Autobus> autobus) {
		this.tratta = tratta.clone();
		this.hostess = hostess;
		this.autisti = autisti;
		this.autobus = autobus;
	}
}
