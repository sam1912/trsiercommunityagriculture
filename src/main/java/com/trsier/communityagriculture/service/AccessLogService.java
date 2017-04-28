package com.trsier.communityagriculture.service;

import com.trsier.communityagriculture.entity.auth.AccessLog;
import com.trsier.communityagriculture.repository.AccessLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly=true)
public class AccessLogService {
	
	@Autowired
	private AccessLogRepository accessLogRepository;
	
	@Transactional(readOnly=false)
	public void save(AccessLog accessLog) {
		accessLogRepository.save(accessLog);
	}

	public List<AccessLog> findAll(){
		return accessLogRepository.findAll();
	}
}
