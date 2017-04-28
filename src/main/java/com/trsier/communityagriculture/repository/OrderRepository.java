package com.trsier.communityagriculture.repository;

import com.trsier.communityagriculture.entity.order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface OrderRepository extends MongoRepository<Order,String> {
}
