package nuovaAgenzia;

import java.util.*;

public class Prodotto {

	protected Tratte tratta;
	protected List<Dipendente> hostess;
	protected List<Dipendente> autisti;
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

	public List<Dipendente> getHostess() {
		return hostess;
	}

	public List<Dipendente> getAutisti() {
		return autisti;
	}

	public List<Autobus> getAutobus() {
		return autobus;
	}

	public Prodotto(Tratte T, List<Dipendente> LDH, List<Dipendente> LDA, List<Autobus> LA) {
		tratta = T.clone();
		hostess = LDH;
		autisti = LDA;
		autobus = LA;
	}
}
