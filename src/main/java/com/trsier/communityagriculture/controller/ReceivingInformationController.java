package com.trsier.communityagriculture.controller;

import com.trsier.communityagriculture.common.annotation.Api;
import com.trsier.communityagriculture.common.constant.ApiConstant;
import com.trsier.communityagriculture.entity.receivingInformation.ReceivingInformation;
import com.trsier.communityagriculture.repository.ReceivingInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/26.
 */
@RestController
public class ReceivingInformationController extends BaseController{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Api(name= ApiConstant.TEST_HTTP)
    @RequestMapping(value = "/api/v1/communityagriculture",method = RequestMethod.GET,produces = "application/json")
    public Map<String,? extends Object> get(){
        ReceivingInformation receivingInformation = new ReceivingInformation();
        receivingInformation.setProvince("guizhou");
        receivingInformation.setCity("tongren");
        receivingInformation.setDistrict("wanshan");
        receivingInformation.setCommunity("kaixuanchuntian");
        receivingInformation.setDetailAddress("5幢591");
        receivingInformation.setIsDefault(true);
        receivingInformation.setPhone("14705144417");
        receivingInformation.setReceiverName("san");
        System.out.println("开始插入receivingInformation++++++++++++++++++++++++++++++");
        mongoTemplate.insert(receivingInformation);
        System.out.println("插入receivingInformation完成++++++++++++++++++++++++++++++");
        ReceivingInformation receivingInformation1 = mongoTemplate.findOne(new Query(Criteria.where("receiverName").is("san")),ReceivingInformation.class);
        return rtnParam(0,receivingInformation1);
    }

}
