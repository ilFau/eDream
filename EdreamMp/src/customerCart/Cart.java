package customerCart;

import java.util.List;

public interface Cart {
	public double getTotal();
	public Receipt pay();
	
	public void add(ProductSellable product);
	public void remove(ProductSellable product);
	public List<ProductSellable> getPurchase();
	
	public void setType(Cashier type);
	public double getExtras();
	
}
