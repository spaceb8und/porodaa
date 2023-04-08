package com.example.poroda.repo;

import com.example.poroda.entity.cat.test.CatTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatTestRepository extends JpaRepository<CatTest,Long> {
}
