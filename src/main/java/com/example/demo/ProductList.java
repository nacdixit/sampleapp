package com.example.demo;

import java.util.List;

public class ProductList {

	
	private List<String> productlists;

	public ProductList(List<String> productlists) {
		super();
		this.productlists = productlists;
	}

	public ProductList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getProductlists() {
		return productlists;
	}

	public void setProductlists(List<String> productlists) {
		this.productlists = productlists;
	}
	
}
