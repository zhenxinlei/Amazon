package com.amazon.entity;

public class Book {

	private long id;
	private String name;
	private double price;
	private int inventory;
	private int orderAmount;
	
	
	public Book(long id, String name, double price, int inventory,
			int orderAmount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.inventory = inventory;
		this.orderAmount = orderAmount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	} 
	
	
}
