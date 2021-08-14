package com.example.demo.persistence.repository;

import com.example.techthink.persistence.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
