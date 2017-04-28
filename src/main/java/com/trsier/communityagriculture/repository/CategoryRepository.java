package com.trsier.communityagriculture.repository;

import com.trsier.communityagriculture.entity.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface CategoryRepository extends MongoRepository<Category,String> {
    Category findByName(String categoryName);
}
