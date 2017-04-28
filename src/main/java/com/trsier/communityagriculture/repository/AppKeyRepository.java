package com.trsier.communityagriculture.repository;

import com.trsier.communityagriculture.entity.auth.AppKey;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * appkey管理操作
 * @author xiaoqiang
 *
 */
public interface AppKeyRepository extends MongoRepository<AppKey, String> {
	
	AppKey findByAppId(String appId);
}
