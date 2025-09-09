package com.projetoweb.vendapro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoweb.vendapro.entities.Category;
import com.projetoweb.vendapro.entities.Product;
import com.projetoweb.vendapro.repositories.CategoryRepository;
import com.projetoweb.vendapro.repositories.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		
		return repository.findAll();
		
			}
	
	public Product findById(Long id) {
		
		Optional<Product>   obj = repository.findById(id);
		
		return obj.get();
	}

}
