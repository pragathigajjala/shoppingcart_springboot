package com.ecommerce.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.model.CartItem;
import com.ecommerce.demo.model.Product;
import com.ecommerce.demo.repository.ProductRepository;

@Service
public class ProductService {	
	@Autowired
	private ProductRepository productrepo;
	
public List<Product> getAllproducts()
{
	List<Product> products=new ArrayList<>();
	productrepo.findAll().forEach(products::add);
	return products;
}
public Optional<Product> getproduct(int id) {                //Why Optional
	return productrepo.findById(id);
}

public void addproduct(Product product) {
productrepo.save(product);
}
public void updateproduct(int id, Product product) {
	productrepo.save(product);
}
public void deleteproduct(int id) {
	
productrepo.deleteById(id);
}
}
