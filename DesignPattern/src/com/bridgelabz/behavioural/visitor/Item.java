package com.bridgelabz.behavioural.visitor;

public interface Item {
	public int accept(ShoppingCartVisitor visitor);

}
