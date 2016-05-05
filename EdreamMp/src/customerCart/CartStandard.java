package customerCart;
import java.util.LinkedList;
import java.util.List;

public abstract class CartStandard implements Cart{

	private List<ProductSellable> inTheCart;

	public CartStandard() {
		this.setInTheCart(new LinkedList<ProductSellable>());
	}
	
	/** Se ci sono prodotti nel carrello li elimina e ritorna la fattura di questi,
	 * altrimenti se la lista e vuota non fa nulla e ritorna un valore null.
	 */
	@Override
	public Receipt pay() {
		if(!this.getPurchase().isEmpty()){
			Receipt fattura = new Receipt(this);
			this.getPurchase().clear();
			return fattura;	
		}
		return null;
	}
	
	@Override
	public List<ProductSellable> getPurchase() {
		return inTheCart;
	}

	@Override
	public void add(ProductSellable product) {
		this.getPurchase().add(product);
	}

	@Override
	public void remove(ProductSellable product) {
		this.getPurchase().remove(product);
	}
	
	public void setInTheCart(List<ProductSellable> inTheCart) {
		this.inTheCart = inTheCart;
	}
	
	protected double calculateTotal(){
		return Cashier.getPartial(this.getPurchase());
	}
	

}