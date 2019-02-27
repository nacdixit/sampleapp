package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	private static Map<String,Product> productrepo=new HashMap<>();
	
	private static List<String> lstrepo=new ArrayList<String>();
	static{
		Product p=new Product();
		p.setId("1");
		p.setName("nachiket");
		
		productrepo.put(p.getId(), p);
		
		Product p2=new Product();
		p2.setId("2");
		p2.setName("nac");
		
		
		productrepo.put(p2.getId(), p2);
		
		
		ProductList p3=new ProductList();
		

//			ArrayList<String> tmplst= new ArrayList<String>();
			
		lstrepo.add("Product 1");
		lstrepo.add("Product 2");
		lstrepo.add("Product 3");
		lstrepo.add("Product 4");
		lstrepo.add("Product 5");
			
			p3.setProductlists(lstrepo);
		
		
		
		
	}
	
	
	@RequestMapping(value="/products/{id}")
	public ResponseEntity<Object> get(@PathVariable("id") String id)
	{
		
		
		return new ResponseEntity<>(productrepo.get(id),HttpStatus.OK);
	}
	
	@RequestMapping(value="/products")
	public ResponseEntity<Object> getall()
	{
		return new ResponseEntity<Object>(productrepo.values(),HttpStatus.OK);
	}
	
	@SuppressWarnings("null")
	@RequestMapping(value="/productslist")
	public ResponseEntity<Object> getAllProducts()
	{
		
//		List<ProductList> plist=new ArrayList<>();
//				for (ProductList item : cars) {   
//				    System.out.println(item.getMake() + " " + item.getReg());
//				}
		
		for(String item: lstrepo)
		{
			System.out.println(item);
			
		}
		
//		System.out.println(lstrepo);
		return new ResponseEntity<Object>(lstrepo,HttpStatus.OK);
	}
	
	@RequestMapping(value="/products" , method=RequestMethod.POST)
	public ResponseEntity<Object> save(@RequestBody Product p)
	{
		
		productrepo.put(p.getId(),p);
		return new ResponseEntity<>("Posted",HttpStatus.OK);
		
	}
	
	
	
	
	
	
	@RequestMapping(value="/productupdate" , method=RequestMethod.PUT)
	public ResponseEntity<Object> edit(@RequestBody Product p)
	{
//		productrepo.remove(id);
		String tmpid=p.getId();
		productrepo.remove(tmpid);
		productrepo.put(p.getId(),p);
		System.out.println(p.toString());
		
		return new ResponseEntity<>("UPDATED",HttpStatus.OK);	
		
	}
	
	
	
	
	
	
	
	
	
	
	

	
}
