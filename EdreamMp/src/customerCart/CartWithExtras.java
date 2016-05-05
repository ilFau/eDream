package customerCart;

public class CartWithExtras extends CartStandard {
	private Cashier typeDiscount;
	
	
	public CartWithExtras(){
		super();
		this.setType(new CashierNormal());
	}
	
	@Override
	public double getTotal(){
		double sum = super.calculateTotal();
		double discount = this.getExtras();
		return sum - discount;
	}
	
	@Override
	public double getExtras(){
		return this.getType().calculateDiscount(this);
	}
	
	@Override
	public void setType(Cashier type) {
		this.typeDiscount = type;
	}

	public Cashier getType() {
		return this.typeDiscount;
	}

	
}
