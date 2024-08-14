package com.example.AdminBE.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;
@Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List getProduct(){
        return productRepo.findAll();
    }
    public Product addProduct(Product product){
        return productRepo.save(product);
    }
    public Product updateProduct(Product product){
        return productRepo.save(product);
    }
    public boolean deleteProduct(Long id){
        try {
            productRepo.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
