package com.example.course.repositories;

import com.example.course.entity.Order;
import com.example.course.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
