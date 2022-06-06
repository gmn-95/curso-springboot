package com.gustavoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
