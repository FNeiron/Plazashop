package com.plaza.spring.springboot.plazashop.repository;
import com.plaza.spring.springboot.plazashop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long>{
    Optional<Order> findById(Long id);
}