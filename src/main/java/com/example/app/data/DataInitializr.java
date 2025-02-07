package com.example.app.data;

import com.example.app.entity.ProductEntity;
import com.example.app.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializr {

    private final ProductRepository productRepository;

    @PostConstruct
    public void initializeData() {
        for (int i = 0; i < 5; i++) {
            ProductEntity productEntity = new ProductEntity("name" + i);
            productRepository.save(productEntity);
        }
    }
}
