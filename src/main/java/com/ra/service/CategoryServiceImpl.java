package com.ra.service;

import com.ra.model.entity.Category;
import com.ra.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{

//    private final CategoryRepository categoryRepository;
//    @Autowired
//    public CategoryServiceImpl(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category saveOrUpdate(Category category) {
        return null;
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
