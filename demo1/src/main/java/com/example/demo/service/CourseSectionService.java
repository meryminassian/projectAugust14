package com.example.demo.service;

import com.example.techthink.persistence.CourseSection;
import com.example.techthink.service.DTO.CourseSectionDTO;

import java.util.List;

public interface CourseSectionService{

    CourseSection create(CourseSectionDTO request);
    CourseSection enrollIn(Long studentId, Long sectionId);
    CourseSection readById(Long id);
    List<CourseSection> readAll();
    CourseSection update(Long id, CourseSectionDTO request);
    Boolean delete(Long id);

}
