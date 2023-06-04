package com.plaza.spring.springboot.plazashop.repository;
import com.plaza.spring.springboot.plazashop.entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DishRepository extends JpaRepository<Dish, Long>{
    Optional<Dish> findById(Long id);
}