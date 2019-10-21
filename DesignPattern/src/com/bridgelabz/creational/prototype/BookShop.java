package com.bridgelabz.creational.prototype;


import java.util.ArrayList;
import java.util.List;
import Utility.Utility;


public class BookShop implements Cloneable{
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		BookShop shop=new BookShop();
		for(Book b:this.getBook())
		{
			shop.getBook().add(b);
		}
		return shop;
	}

	private String shopName;
	List<Book> book=new ArrayList<Book>();
	
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBook() {
		return book;
	}

	public void loaddata()
	{
//		System.out.println("Enter How Many Book You Want");
//		int count=Utility.isInteger();
//		for(int i=1;i<=count;i++) 
//		{
//			Book b=new Book();
//			System.out.println("Enter Book id");
//			int id=Utility.isInteger();
//			b.setBookid(id);
//			Utility.isString();
//			System.out.println("Enter Book name");
//			String name=Utility.isString();
//			b.setBookname(name);
//			getBook().add(b);
//			
//		 }
		
		for(int i=1;i<3;i++)
		{
			Book b=new Book();
			b.setBookid(i);
			b.setBookname("name"+i);
			getBook().add(b);
		}
	}
	
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", book=" + book + "]";
	}
	

}
