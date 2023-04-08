package com.example.poroda.repo;

import com.example.poroda.entity.dog.test.DogTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogTestRepository extends JpaRepository<DogTest, Long> {
}
