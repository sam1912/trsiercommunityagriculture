package com.trsier.communityagriculture.entity.cart;

import com.trsier.communityagriculture.entity.cartItem.CartItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
@Document(collection="t_carts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    private String id;


    private String oppenId;
    private List<CartItem> cartItems;

}
