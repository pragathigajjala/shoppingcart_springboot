package com.ecommerce.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.model.Product;
import com.ecommerce.demo.service.ProductService;
import com.sun.el.stream.Optional;

@RestController
public class ProductController 
{
	@Autowired
	private ProductService productservice;

	@GetMapping("/Products")
    public List<Product> getAllProducts() {
	return productservice.getAllproducts();
	}
	
	@GetMapping("/Products/{id}")
	public java.util.Optional<Product> getProduct(@PathVariable int id){
		return productservice.getproduct(id);
	}
		
		@PostMapping("/Products")
		public void addProduct(@RequestBody Product Product)
		{
			
			productservice.addproduct(Product);
		}
		
		@PutMapping("/Products/{id}")
		public void updateProduct(@RequestBody Product Product,@PathVariable int id)
		{
			
			productservice.updateproduct(id,Product);
		}
		
		@DeleteMapping("/Products/{id}")
		public void deleteProduct(@PathVariable int id) {
	     productservice.deleteproduct(id);
		}
}
