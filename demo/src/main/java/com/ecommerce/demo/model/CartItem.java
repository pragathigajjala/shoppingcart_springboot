package com.ecommerce.demo.model;

import java.util.Optional;

public class CartItem {
	private Optional<Product> product;
	private int quantity;

	public Optional<Product> getProduct() {
		return product;
	}

	public void setProduct(Optional<Product> product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CartItem(Optional<Product> product2, int qty) {
		this.product=product2;
		this.quantity=qty;
		}

			

}