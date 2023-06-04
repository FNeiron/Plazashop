package com.plaza.spring.springboot.plazashop.repository;
import com.plaza.spring.springboot.plazashop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findById(Long id);
}