package com.store.mystore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.mystore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
