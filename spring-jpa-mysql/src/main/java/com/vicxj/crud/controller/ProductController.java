package com.vicxj.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicxj.crud.entiry.Products;
import com.vicxj.crud.service.ProductService;

@RestController
@RequestMapping("/flipkart")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/addProduct")
	public Products addProduct(@RequestBody Products product) {

		return service.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Products> addProduct(@RequestBody List<Products> products) {

		return service.saveAllProducts(products);
	}

	@GetMapping("/products")
	public List<Products> findAllProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/product/{id}")
	public Products findProductById(@PathVariable int id) {

		return service.getProductById(id);
	}

	/*
	 * @GetMapping("/product/name/{name}") public Products
	 * findProductByName(@PathVariable String name) {
	 * 
	 * return service.getProductByName(name); }
	 */

	@DeleteMapping("/product/remove/{id}")
	public String deleteProduct(@PathVariable int id) {

		return service.deleteProduct(id);
	}
	
	@PutMapping("/product/modify")
	public Products modifyProduct(@RequestBody Products product) {

		return service.updateProduct(product);
	}

}
