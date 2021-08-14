package com.example.demo.service;

import com.example.techthink.persistence.SubCategory;
import com.example.techthink.service.DTO.SubCategoryDTO;

import java.util.List;

public interface SubCategoryService {
    SubCategory create(SubCategoryDTO request);
    SubCategory readById(Integer id);
    List<SubCategory> readAll();
    SubCategory update(Integer id, SubCategoryDTO request);
    Boolean delete(Integer id);
}
