package com.trsier.communityagriculture.service;

import com.trsier.communityagriculture.entity.receivingInformation.ReceivingInformation;
import com.trsier.communityagriculture.repository.ReceivingInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/26.
 */
@Service
public class ReceivingInformationService {
    @Autowired
    private ReceivingInformationRepository receivingInformationRepository;

    public void getAddress(){
        ReceivingInformation receivingInformation = new ReceivingInformation();
        receivingInformation.setProvince("guizhou");
        receivingInformation.setReceiverName("shuzhen");
        receivingInformation.setPhone("14705144417");
        receivingInformation.setIsDefault(true);
        receivingInformation.setCity("tongren");
        receivingInformation.setDistrict("wanshan");
        receivingInformation.setCommunity("kaixuanchuntian");
        receivingInformation.setDetailAddress("14幢5-14");
        receivingInformationRepository.save(receivingInformation);
    }

    public void deleteAll(){
        receivingInformationRepository.deleteAll();
    }

}
