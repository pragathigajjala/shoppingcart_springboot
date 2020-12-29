package com.ecommerce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.model.Product;

@Service
public interface ProductRepository extends JpaRepository<Product,Integer> 
{
		
}