package com.trsier.communityagriculture.entity.order;

import com.trsier.communityagriculture.entity.orderItem.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
@Document(collection="t_orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String id;

    private String oppenId;
    private String orderSn;
    private String createDate;
    private String dispatchingTime;
    private Boolean isReceived;
    private Boolean isPayment;
    private String buyerMessage;
    private String status;
    private List<OrderItem> orderItems;

}
