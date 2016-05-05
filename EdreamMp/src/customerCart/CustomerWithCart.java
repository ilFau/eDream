package customerCart;

public interface CustomerWithCart extends Customer {

	public Cart getCart();
	public void setCart(Cart myCart);

}
