package com.vicxj.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicxj.crud.entiry.Products;
import com.vicxj.crud.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Products saveProduct(Products product) {

		return repository.save(product);
	}

	public List<Products> saveAllProducts(List<Products> products) {

		return repository.saveAll(products);
	}

	public List<Products> getAllProducts() {

		return repository.findAll();
	}

	public Products getProductById(int id) {

		return repository.findById(id).orElse(null);
	}

	/*
	 * public Products getProductByName(String pname) {
	 * 
	 * return repository.findByProduct_name(pname).orElse(null); }
	 */
	public String deleteProduct(int id) {

		repository.deleteById(id);

		return "Product removed : " + id;
	}

	public Products updateProduct(Products product) {

		Products existingProduct = repository.findById(product.getProduct_id()).orElse(null);
		existingProduct.setProduct_id(product.getProduct_id());
		existingProduct.setProduct_name(product.getProduct_name());
		existingProduct.setProduct_price(product.getProduct_price());

		return repository.save(existingProduct);
	}

}
