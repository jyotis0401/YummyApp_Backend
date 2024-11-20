package com.mapper;

import org.restaurant.dto.ProductRequest;
import org.restaurant.dto.ProductResponse;
import org.restaurant.entity.Products;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public Products toProductEntity(ProductRequest request) {
        return Products.builder()
                .name(request.name())
                .price(request.price())
                .build();
    }

    public ProductResponse toProductResponse(Products products) {
        return new ProductResponse(
                products.getName(),
                products.getPrice()
        );
    }
}
