package customerCart;

import java.util.*;

public class Receipt implements Comparable<Receipt>{
	private Date date;
	private List<String> listOfPurchase;
	private double total;
	
	public Receipt(Cart cart){
		this.date = new Date();
		this.listOfPurchase = new ArrayList<String>();
		this.stampReceipt(cart);
	}

	private void stampReceipt(Cart cart) {
		this.writeProducts(cart);
		this.writeExtra(cart);
		this.setTotal(cart);
	}

	private void writeExtra(Cart cart) {
		if(cart.getExtras() != 0){
			listOfPurchase.add("Discount");
			listOfPurchase.add(cart.getExtras()+"€");
		}
	}

	private void writeProducts(Cart cart) {
		List<ProductSellable> products = cart.getPurchase();
		Iterator<? extends ProductSellable> productIterator = products.iterator();
		while(productIterator.hasNext()){
			ProductSellable that = productIterator.next();
			listOfPurchase.add(that.toString());
			listOfPurchase.add(that.getPrice()+"€");
		}
	}
	
	private void setTotal(Cart cart) {
		this.total =  cart.getTotal();
	}
	
	public List<String> getListOfPurchase(){
		return this.listOfPurchase;
	}
	
	public double getTotal() {
		return total;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public int compareTo(Receipt otherReceipt) {
		Date myDate = this.getDate();
		return myDate.compareTo(otherReceipt.getDate());
	}
	
	
}
