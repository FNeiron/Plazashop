package com.plaza.spring.springboot.plazashop.service.impl;

import com.plaza.spring.springboot.plazashop.entities.Dish;
import com.plaza.spring.springboot.plazashop.repository.DishRepository;
import com.plaza.spring.springboot.plazashop.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DishServiceImpl implements DishService {
    private final DishRepository productRepository;

    @Autowired
    public DishServiceImpl(DishRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Page<Dish> findAllProductsPageable(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Optional<Dish> findById(Long id) {
        return productRepository.findById(id);
    }
}
