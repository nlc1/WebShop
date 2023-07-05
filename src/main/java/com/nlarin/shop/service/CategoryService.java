package com.nlarin.shop.service;

import com.nlarin.shop.dto.CategoryDto;

import java.util.List;

/**
 * @author Aleksey Zhdanov
 * @version 1
 */
public interface CategoryService {

    /**
     * <p>Возвращает список всех категорий товаров</p>
     *
     * @return Список категорий
     */
    List<CategoryDto> findAll();

}
