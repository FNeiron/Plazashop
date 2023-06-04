package com.plaza.spring.springboot.plazashop.repository;
import com.plaza.spring.springboot.plazashop.entities.Instance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstanceRepository extends JpaRepository<Instance, Long>{
    Optional<Instance> findById(Long id);
}
