package com.trsier.communityagriculture.entity.receivingInformation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Administrator on 2017/4/26.
 */
@Document(collection="t_receiving_informations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceivingInformation {
    @Id
    private String id;
    /*收货人姓名*/
    private String receiverName;
    /*收货人电话*/
    private String phone;
    /*收货人所在省份*/
    private String province;
    /*收货人所在城市*/
    private String city;
    /*收货人所在区县*/
    private String district;
    /*收货人所在小区*/
    private String community;
    /*收货人的详细地址，如路，门牌号等*/
    private String detailAddress;
    /*是否为默认*/
    private Boolean isDefault;
}
