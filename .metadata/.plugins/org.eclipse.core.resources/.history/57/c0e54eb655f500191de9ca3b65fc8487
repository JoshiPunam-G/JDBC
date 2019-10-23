package com.bridgelabz.structural.visitor;

public class Book implements Item{
	
	private int price;
	private String number;
	public Book(int price, String number) {
		super();
		this.price = price;
		this.number = number;
	}
	
	public int getPrice()
	{
	   return price;	
	}
	public String getNumber()
	{
		return number;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
		
	}
	

}
