package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	@GetMapping(path = "products")
	public List<Product> findAll(){
		return productService.findAll();
	}
	
	@GetMapping(path = "products/{id}")
	public Product findById(@PathVariable(name = "id") int id){
		return productService.getById(id);
	}
	
	@PostMapping(path = "products")
	public Product addProduct( @RequestBody Product product){
		return productService.addProduct(product);
	}
	
	@DeleteMapping(path = "products/{id}")
	public Product deleteProduct(@PathVariable(name = "id") int id){
		return productService.deleteProduct(id);
	}
	
	@PutMapping(path = "products/{id}")
	public Product updateProduct(@PathVariable(name = "id") int id, @RequestBody Product product){
		return productService.updateProduct(id, product);
	}
}