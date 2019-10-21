package com.bridgelabz.creational.prototype;

public class BookMain {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		BookShop bs=new BookShop();
		bs.setShopName("NOVELTY");
	    bs.loaddata();
		System.out.println(bs);
		
		
		BookShop bs1=bs.clone();
		bs1.setShopName("LIBERTY");
		bs.getBook();
		System.out.println(bs1);
		
		
	}

}
