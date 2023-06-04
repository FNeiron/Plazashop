package com.plaza.spring.springboot.plazashop.repository;
import com.plaza.spring.springboot.plazashop.entities.Administrator ;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdministratorRepository extends JpaRepository<Administrator, Long>{
    Optional<Administrator> findById(Long id);
}
