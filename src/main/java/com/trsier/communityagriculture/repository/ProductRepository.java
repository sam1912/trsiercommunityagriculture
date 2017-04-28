package com.trsier.communityagriculture.repository;

import com.trsier.communityagriculture.entity.category.Category;
import com.trsier.communityagriculture.entity.product.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface ProductRepository extends MongoRepository<Product,String> {
    List<Product> findByCategory(Category category);
    Product findByName(String name);
    List<Product> findByTotalSale(Sort sort);
    List<Product> findByPrice(Sort sort);
}
