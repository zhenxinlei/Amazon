package com.amazon.dao;

import java.util.Hashtable;
import java.util.Iterator;

import com.amazon.entity.Book;

public class BookDao {
	private Book book;
	private static Hashtable<Long, Book> orderList;
	
	public static Hashtable<Long, Book> addToOrder(Book book, int amount){
		book.setOrderAmount(amount);
		orderList.put(book.getId(), book);
		return orderList;
	}
	
	public double totalPrice(Hashtable<Long, Book> orderList){
		double sum=0.0;
		if(orderList.isEmpty()){
			return 0.0;
		}else {
			Iterator<Book> it= orderList.values().iterator();
			while(it.hasNext()){
				sum=it.next().getPrice()+sum;
			}
			return sum;
		}
	}

}
