package com.trsier.communityagriculture.repository;

import com.trsier.communityagriculture.entity.orderItem.OrderItem;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface OrderItemRepository extends MongoRepository<OrderItem,String>{
}
