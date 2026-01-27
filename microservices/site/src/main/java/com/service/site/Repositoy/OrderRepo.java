package com.service.site.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.service.site.Entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
