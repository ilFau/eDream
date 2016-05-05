package customerCart;

import java.util.Iterator;
import java.util.List;

/**
 * Le strategie del carrello devono implementare questa interfaccia che prevede 
 * già un metodo statico per il semplice calcolo del parziale nel carrello.
 * CalculateDiscount restituisce un double, negativo se è effettivamente uno sconto
 * positivo se è una maggiorazione del prezzo totale.
 *
 */

public interface Cashier {
	
	public static double getPartial(List<ProductSellable> list){
		Iterator<ProductSellable> products = list.iterator();
		double sum=0;
		while(products.hasNext()){
			ProductSellable thatProduct = products.next();
			sum += thatProduct.getPrice(); 
		}
		return sum;
	}
	
	public double calculateDiscount(Cart cart);
}
