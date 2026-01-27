package com.service.site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.service.site.Entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Long> {
}
