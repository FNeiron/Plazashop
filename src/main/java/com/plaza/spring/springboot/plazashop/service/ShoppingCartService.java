package com.plaza.spring.springboot.plazashop.service;


//import exception.NotEnoughProductsInStockException;
import com.plaza.spring.springboot.plazashop.entities.Dish;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Dish product);

    void removeProduct(Dish product);

    Map<Dish, Integer> getProductsInCart();

    //void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
