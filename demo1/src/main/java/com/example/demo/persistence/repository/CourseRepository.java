package com.example.demo.persistence.repository;

import com.example.techthink.persistence.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
