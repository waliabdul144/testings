package com.service.site.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import com.service.site.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
