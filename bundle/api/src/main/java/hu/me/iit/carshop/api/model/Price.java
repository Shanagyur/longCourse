package hu.me.iit.carshop.api.model;

import java.util.Currency;

public class Price {

	private  double amount;
	private Currency currency;
	
	public Price(double amount, Currency currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Currency getCurrency() {
		return currency;
	}
	
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
}
