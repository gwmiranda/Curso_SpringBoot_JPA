package com.example.course.repositories;

import com.example.course.entity.Category;
import com.example.course.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
