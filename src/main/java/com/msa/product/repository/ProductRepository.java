package com.msa.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msa.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
