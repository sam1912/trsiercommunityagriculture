package com.trsier.communityagriculture.repository;

import com.trsier.communityagriculture.entity.auth.ApiInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * api管理操作
 * @author xiaoqiang
 *
 */
public interface ApiInfoRepository extends MongoRepository<ApiInfo, String> {

	ApiInfo findByName(String apiName);

}
