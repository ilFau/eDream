package eDreamPack;

import java.util.*;
import customerCart.CustomerWithCart;
import customerCart.Cart;
import customerCart.Receipt;

public class Customer extends Person implements Client, CustomerWithCart {
	private Cart myCart;
	private List<Receipt> myPurchaseHistory;
	
	public Customer(String name, String lastName, String fiscalCode){
		super(name, lastName, fiscalCode);
	}
	
	@Override
	public Cart getCart() {
		return myCart;
	}
	@Override
	public void setCart(Cart myCart) {
		this.myCart = myCart;
	}

	@Override
	public List<Receipt> getPurchaseHistory() {
		return myPurchaseHistory;
	}

	@Override
	public void addToHistory(Receipt receipt) {
		if(this.myPurchaseHistory == null){
			this.myPurchaseHistory = new LinkedList<Receipt>();
		}
		this.myPurchaseHistory.add(receipt);
	}
}
