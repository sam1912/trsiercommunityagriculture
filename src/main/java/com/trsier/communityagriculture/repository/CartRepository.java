package com.trsier.communityagriculture.repository;

import com.trsier.communityagriculture.entity.cart.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface CartRepository extends MongoRepository<Cart,String> {
}
