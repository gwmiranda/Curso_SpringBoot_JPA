package com.example.course.repositories;

import com.example.course.entity.OrderItem;
import com.example.course.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
