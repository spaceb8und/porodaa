package com.example.poroda.repo;

import com.example.poroda.entity.cat.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
