package com.gae.facturacion.auth.repository;

import com.gae.facturacion.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    // Spring Data JPA generará los métodos básicos
}
