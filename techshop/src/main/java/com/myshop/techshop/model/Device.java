package com.myshop.techshop.model;

public class Device {

	private String name;
	private Float price;
	private String desciption;
	
	public Device() {
		// TODO Auto-generated constructor stub
	}

	public Device(String name, Float price, String desciption) {
		this.name = name;
		this.price = price;
		this.desciption = desciption;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Override
	public String toString() {
		return "Device [name=" + name + ", price=" + price + ", desciption=" + desciption + "]";
	}
	
	public Float getTotalPrice() {
		float tax = 0.0f;
		
		return (this.price * tax + 1.0f);
	}
	public Float getTotalWithDiscount() {
		float discount = 0.1f;
		
		return getTotalPrice() - getTotalPrice() * discount;
	}

}
