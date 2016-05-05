package customerCart;

/**
 * Tutti gli oggetti che hanno un prezzo possono implementare questa interfaccia 
 *  comportamentale ed essere utilizzati dal carrello di questo pacchetto.
 *  Viene utilizzato anche il metodo toString();
 *
 */

public interface ProductSellable {
	public double getPrice();
}
