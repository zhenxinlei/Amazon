package com.amazon.entity;



import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;


public class Order {
	
	//List<Book> orderList=new ArrayList();
	
	/*@Autowired
	private  Hashtable<Long, Book> orderList;
	

	public Hashtable<Long, Book> getOrderList() {
		return orderList;
	}

	public void setOrderList(Hashtable<Long, Book> orderList) {
		this.orderList = orderList;
	}
	*/
	
/*	private Book book;
	private  Hashtable<Long, Book> orderList;*/
	
	private Hashtable<Long, Book> orderList;

	
	
	public Hashtable<Long, Book> getOrderList() {
		return orderList;
	}

	public void setOrderList(Hashtable<Long, Book> orderList) {
		this.orderList = orderList;
	}
	
	
//
//	public Hashtable<Long, Book> addToOrder(Book book, int amount){
//		this.book.setOrderAmount(amount);
//		this.orderList.put(book.getId(), book);
//		return orderList;
//	}
	
	/*public double totalPrice(Hashtable<Long, Book> orderList){
		double sum=0.0;
		if(orderList.isEmpty()){
			return 0.0;
		}else {
			Iterator<Book> it= orderList.values().iterator();
			while(it.hasNext()){
				if(it.next().getOrderAmount()>0)
				sum=it.next().getPrice()*it.next().getOrderAmount()+sum;
			}
			return sum;
		}
	}*/
	
/*	public void printOrder(Hashtable<Long, Book> orderList){
		if(orderList.isEmpty()){
			System.out.println("The book list is empty!");
		}else{
			System.out.println("Your book list is: ");
			Iterator<Book> it= orderList.values().iterator();
			while(it.hasNext()){
				if(it.next().getOrderAmount()>0)
					System.out.println(it.next().getName()+" "+it.next().getPrice()+" "+it.next().getOrderAmount());
			}
		}
	}*/
	

}
