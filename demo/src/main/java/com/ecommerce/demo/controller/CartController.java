package com.ecommerce.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.demo.model.CartItem;
import com.ecommerce.demo.model.Product;
import com.ecommerce.demo.service.ProductService;

@Controller
@RequestMapping(value = "/cart")
public class CartController {
	@Autowired
	ProductService productservice = new ProductService();
	@RequestMapping(value = "/buy/{id}/{qty}", method = RequestMethod.POST)
	public Optional<Product> buy(@PathVariable("id") int id,@PathVariable("qty") int qty,HttpSession session) {
	        List<CartItem> cart = new ArrayList<CartItem>();
			Optional<Product> product=productservice.getproduct(id);
			cart.add(new CartItem(product,qty));
			return product;
		}
				
	}
