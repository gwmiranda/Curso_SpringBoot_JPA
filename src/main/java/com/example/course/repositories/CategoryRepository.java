package com.example.course.repositories;

import com.example.course.entity.Category;
import com.example.course.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
