package com.trsier.communityagriculture.service;

import com.trsier.communityagriculture.entity.category.Category;
import com.trsier.communityagriculture.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category save(Category category){
        return categoryRepository.save(category);
    }

    public Category findByName(String categoryName){
        return categoryRepository.findByName(categoryName);
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findOne(String id){
        return categoryRepository.findOne(id);
    }

}
