package com.trsier.communityagriculture.service;

import com.trsier.communityagriculture.entity.category.Category;
import com.trsier.communityagriculture.entity.product.Product;
import com.trsier.communityagriculture.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findByCategory(Category category){
        return productRepository.findByCategory(category);
    }

    public Product findOne(String id){
        return  productRepository.findOne(id);
    }

    public List<Product> findByTotalSale(Sort sort){
        return productRepository.findByTotalSale(sort);
    }

    public List<Product> findByPrice(Sort sort){
        return productRepository.findByPrice(sort);
    }

    public void save(Product product){
        productRepository.save(product);
    }

}
