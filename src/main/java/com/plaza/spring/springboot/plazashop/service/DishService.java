package com.plaza.spring.springboot.plazashop.service;

import com.plaza.spring.springboot.plazashop.entities.Dish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface DishService {

    Optional<Dish> findById(Long id);

    Page<Dish> findAllProductsPageable(Pageable pageable);
}
