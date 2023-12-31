package com.nlarin.shop.dto;

import com.nlarin.shop.entity.Category;
import com.nlarin.shop.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private Long id;

    @NotEmpty
    private String title;

    @NotNull
    @Min(1)
    @Max(1_000_000_000)
    private BigDecimal price;

    @NotNull
    private Category category;

    public ProductDto(String title, BigDecimal price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public static ProductDto valueOf(Product product) {
        return new ProductDto(
                product.getId(),
                product.getTitle(),
                product.getPrice(),
                product.getCategory()
        );
    }

    public Product mapToProduct() {
        return new Product(id, title, price, category);
    }

}
