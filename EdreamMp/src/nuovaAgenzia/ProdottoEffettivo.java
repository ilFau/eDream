package nuovaAgenzia;

import java.util.*;

public class ProdottoEffettivo extends Prodotto{

	Date data;
	
	public ProdottoEffettivo(Tratte T, List<Dipendente> LDH, List<Dipendente> LDA, List<Autobus> LA) {
		super(T, LDH, LDA, LA);
	}

	
}
