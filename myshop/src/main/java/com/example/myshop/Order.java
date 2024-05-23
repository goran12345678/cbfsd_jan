package com.example.myshop;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private Integer id;
	private List<Product> products;
	private Float total;
	private Float tax;

	public Order() {
		// TODO Auto-generated constructor stub
		this.products = new ArrayList<Product>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	public void addProduct(Product p) {
		System.out.println("[Order] addProduct(Product p)");
		this.products.add(p);
		System.out.println("[Order] total products " + this.products.size());
	}

	public Float getTotal() {
		
		float ttlSale = 0;
		
		for(Product p : this.products) {
			ttlSale += p.getPrice();
		}
		float total = ttlSale + ttlSale * this.tax;
		
		System.out.println("[Order] getTotal()");
		
		return total;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", products=" + products + ", total=" + total + ", tax=" + tax + "]";
	}
	
	public void submit() {
		System.out.println("[Order] submit()");
	}

}
