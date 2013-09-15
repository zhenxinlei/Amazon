package com.amazon.test;

import java.util.HashMap;
import java.util.Hashtable;

import com.amazon.entity.Book;
import com.amazon.entity.Order;
import com.amazon.service.CheckoutService;

public class Test {
	
	/*private Book book;
	private HashMap<Long, Book> orderList;
	
	public HashMap<Long, Book> addToOrder(Book book){
		orderList=new HashMap<Long,Book>();
		//this.book.setOrderAmount(book.getOrderAmount());
		orderList.put(book.getId(), book);
		
		return orderList;
	}*/
	
	public static void main(String[] arg){
		Book book1=new Book(1L,"b1",2.99,12,1);
		Book book2=new Book(2L,"b2",3.62,12,0);
		Book book3=new Book(3L,"b3",10.2,12,5);
		Book book4=new Book(4L,"b4",12.2,12,1);
		Book book5=new Book(5L,"b5",19.5,12,3);
		Book book6=new Book(6L,"b6",7.2,12,0);
		
		/*Order order = new Order();
		
		
		
		order.setOrderList(order.addToOrder(book1, 1));
		order.setOrderList(order.addToOrder(book2, 0));
		order.setOrderList(order.addToOrder(book3, 2));
		order.setOrderList(order.addToOrder(book4, 3));
		order.setOrderList(order.addToOrder(book5,0));
		order.setOrderList(order.addToOrder(book6, 1));
	
		
		order.totalPrice(order.getOrderList());
		
		order.printOrder(order.getOrderList());
		*/
		CheckoutService oC=new CheckoutService();
		Order order=new Order();
		
		order.setOrderList(oC.addToOrder(book1));
		order.setOrderList(oC.addToOrder(book2));
		order.setOrderList(oC.addToOrder(book3));
		order.setOrderList(oC.addToOrder(book5));
		order.setOrderList(oC.addToOrder(book4));
		
		order.setOrderList(oC.addToOrder(book6));
		oC.printOrder(order.getOrderList());
		System.out.println(oC.totalPrice(order.getOrderList()));
		
	/*	Hashtable<Long, Book> order=new Hashtable<Long, Book>();
		order.put(book1.getId(), book1);
		order.put(book2.getId(), book2);
		System.out.println(order.get(book1.getId()).getName()+" "+order.get(book2.getId()).getName());
		*/
		/*Test t1=new Test();
		HashMap<Long, Book> order=t1.addToOrder(book1);
		System.out.println(order.get(book1.getId()).getName());*/
		
	
	}

}
