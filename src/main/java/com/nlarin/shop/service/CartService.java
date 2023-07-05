package com.nlarin.shop.service;

import com.nlarin.shop.dto.CartDto;

/**
 * @author Aleksey Zhdanov
 * @version 1
 */
public interface CartService {

    /**
     * <p>Возвращает корзину со всеми товарами</p>
     *
     * @return Корзина
     */
    CartDto find();

    /**
     * <p>Добавляет товар в корзину</p>
     *
     * @param productId Идентификатор товара
     */
    void add(Long productId);

    /**
     * <p>Очищает корзину</p>
     */
    void delete();

}
