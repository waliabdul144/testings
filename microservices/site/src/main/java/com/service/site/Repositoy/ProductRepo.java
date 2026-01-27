package com.service.site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.service.site.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
