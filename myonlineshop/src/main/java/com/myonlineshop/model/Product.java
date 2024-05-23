package com.myonlineshop.model;

/*
  CREATE TABLE Products(
   id int primary key auto_increment,
   name varchar(250),
   make varchar(250),
   description varchar(250),
   price decimal
  );
  
  CREATE USER 'sqluser'@'localhost' IDENTIFIED BY 'Pa$$w0rd;
    
  GRANT ALL PRIVILEGES ON simplilearn.* TO 'sqluser'@'%';
 * 
 */
public class Product {

    private int id; 

	private String name;

	private String make;

	private String description;
 
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String make, String description, float price) {
		this.id = id;
		this.name = name;
		this.make = make;
		this.description = description;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", make=" + make + ", description=" + description + ", price="
				+ price + "]";
	}

}
