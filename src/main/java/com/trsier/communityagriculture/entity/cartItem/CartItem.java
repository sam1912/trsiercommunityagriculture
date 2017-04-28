package com.trsier.communityagriculture.entity.cartItem;

import com.trsier.communityagriculture.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
@Document(collection="t_cart_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    @Id
    private String id;

    private List<Product> products;
    private String title;
    private Double price;
    private Integer quantity;
    private String imageUrl;
}
