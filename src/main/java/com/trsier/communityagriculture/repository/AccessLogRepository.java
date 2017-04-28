package com.trsier.communityagriculture.repository;

import com.trsier.communityagriculture.entity.auth.AccessLog;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 访问日志操作
 * @author xiaoqiang
 *
 */
public interface AccessLogRepository extends MongoRepository<AccessLog, String> {

}
