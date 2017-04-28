package com.trsier.communityagriculture.entity.product;

import com.trsier.communityagriculture.entity.category.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
@Document(collection="t_products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private String id;

    private String name;
    private String unit;
    private String brief;
    private String intro;
    private List<String> image_defaults;
    private String image_file;
    private Double price;
    private Double marketPrice;
    private Double store;
    private Double totalSale;
    private Boolean isSeason;
    private Category category;
}
