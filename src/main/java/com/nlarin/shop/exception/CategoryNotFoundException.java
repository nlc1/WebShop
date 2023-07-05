package com.nlarin.shop.exception;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(String name) {
        super("Не найдена категория товара с именем: '" + name + "'");
    }

}
