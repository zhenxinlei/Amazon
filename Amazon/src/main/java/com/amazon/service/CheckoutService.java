package com.amazon.service;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import com.amazon.entity.Book;
import com.amazon.entity.Order;

@Controller 
public class CheckoutService{
	
/*	@Autowired
	private CheckoutService CheckOU
	public String Checkout(@Valid OrderList orderlist, BindingResult result ){
		if(result.hasErrors()){
			return "hello"; //Need to redirect to order page
		}else {
			checkoutService.checkout(order);
			return "login";//Need to redirect to checkout page
		}
	}*/
	
	 public CheckoutService(){
		 orderList=new Hashtable<Long,Book>();
	}
	//private Order order;
	private Book book;
	private Hashtable<Long, Book> orderList;
	
	public Hashtable<Long, Book> addToOrder(Book book){
		
		//this.book.setOrderAmount(book.getOrderAmount());
		orderList.put(book.getId(), book);
		
		return orderList;
	}
	
	public void printOrder(Hashtable<Long, Book> orderList){
		if(orderList.isEmpty()){
			System.out.println("The book list is empty!");
		}else{
			System.out.println("Your book list is: ");
			System.out.println("Book Name  Price  Ammount ");
			Iterator<Book> it= orderList.values().iterator();
			while(it.hasNext()){
				
				Book currentbook=it.next();
				if(currentbook.getOrderAmount()>0){
					
					System.out.println("   "+currentbook.getName()+"      $"+currentbook.getPrice()+"    "+currentbook.getOrderAmount());
					
				}
			}
		}
	}
	
	public double totalPrice(Hashtable<Long, Book> orderList){
		if(orderList.isEmpty()){
			return 0.0;
		}else{
			double sum=0.0;
			Iterator<Book> it= orderList.values().iterator();
			while(it.hasNext()){
				
				Book currentbook=it.next();
				if(currentbook.getOrderAmount()>0){
					sum=currentbook.getOrderAmount()*currentbook.getPrice()+sum;
				}
			}
			return sum;
		}
	}
	
	

}
