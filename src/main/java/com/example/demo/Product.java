package com.example.demo;

public class Product {
	
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
