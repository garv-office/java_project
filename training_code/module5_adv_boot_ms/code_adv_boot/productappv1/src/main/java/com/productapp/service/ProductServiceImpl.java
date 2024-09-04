package com.productapp.service;

import com.productapp.repo.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//SL=BL+CCC
@Service
@Transactional
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        productRepo.save(product);
        return product;
    }

    @Override
    public Product updateProduct(int id, Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }
}
