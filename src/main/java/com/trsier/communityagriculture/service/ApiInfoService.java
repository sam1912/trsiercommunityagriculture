package com.trsier.communityagriculture.service;

import com.trsier.communityagriculture.entity.auth.ApiInfo;
import com.trsier.communityagriculture.repository.ApiInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly=false)
@Service
public class ApiInfoService {
	@Autowired
	private ApiInfoRepository apiInfoRepository;
	
	public void deleteAll(){
		apiInfoRepository.deleteAll();
	}
	
	public void saveList(Iterable<ApiInfo>list){
		apiInfoRepository.save(list);
	}
	
	public ApiInfo getByApiName(String apiName){
		return apiInfoRepository.findByName(apiName);
	}
}
