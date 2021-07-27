package com.example.course.services;

import com.example.course.entity.Product;
import com.example.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll(){
        return  ProductRepository.findAll();
    }

    public Product findById(Long Id){
        Optional<Product> obj = ProductRepository.findById(Id);
        return  obj.get();
    }


}
