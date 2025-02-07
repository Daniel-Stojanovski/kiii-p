package com.example.app.service;

import com.example.app.entity.ProductEntity;
import com.example.app.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

}
