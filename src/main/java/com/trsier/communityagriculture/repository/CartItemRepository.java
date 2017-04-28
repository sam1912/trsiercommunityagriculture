package com.trsier.communityagriculture.repository;

import com.trsier.communityagriculture.entity.cartItem.CartItem;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface CartItemRepository extends MongoRepository<CartItem,String> {
}
