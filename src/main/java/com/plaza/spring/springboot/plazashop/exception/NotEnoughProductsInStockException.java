package com.plaza.spring.springboot.plazashop.exception;


import com.plaza.spring.springboot.plazashop.entities.Dish;

public class NotEnoughProductsInStockException extends Exception {

    private static final String DEFAULT_MESSAGE = "Not enough products in stock";

    public NotEnoughProductsInStockException() {
        super(DEFAULT_MESSAGE);
    }

    public NotEnoughProductsInStockException(Dish product) {
        //super(String.format("Not enough %s products in stock. Only %d left", product.getName(), product.getQuantity()));
    }

}
