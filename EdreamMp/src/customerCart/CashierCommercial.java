package customerCart;

public class CashierCommercial implements Cashier {

	@Override
	public double calculateDiscount(Cart cart) {
		double sum = Cashier.getPartial(cart.getPurchase());
		return (sum*0.78)-sum;
	}

}
