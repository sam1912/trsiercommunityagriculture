package com.trsier.communityagriculture.controller;

import com.trsier.communityagriculture.entity.receivingInformation.ReceivingInformation;
import com.trsier.communityagriculture.repository.ReceivingInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Administrator on 2017/4/26.
 */
@RestController
@RequestMapping
public class ReceivingInformationController{

    @Autowired
    private ReceivingInformationRepository receivingInformationRepository;

    @RequestMapping(value = "/api/rec",method = RequestMethod.GET)
    public String get(){
        ReceivingInformation receivingInformation = new ReceivingInformation();
        receivingInformation.setProvince("guizhou");
        receivingInformation.setCity("tongren");
        receivingInformation.setCommunity("aaa");
        receivingInformation.setDetailAddress("bbbb");
        receivingInformation.setDistrict("ccc");
        receivingInformation.setIsDefault(true);
        receivingInformation.setPhone("123123");
        receivingInformation.setReceiverName("wwwww");
        receivingInformationRepository.save(receivingInformation);
        return "haha";
    }

}
