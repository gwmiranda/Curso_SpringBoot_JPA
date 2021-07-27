package com.example.course.services;

import com.example.course.entity.Category;
import com.example.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll(){
        return  CategoryRepository.findAll();
    }

    public Category findById(Long Id){
        Optional<Category> obj = CategoryRepository.findById(Id);
        return  obj.get();
    }


}
