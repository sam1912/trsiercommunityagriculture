package com.trsier.communityagriculture.controller;

import com.trsier.communityagriculture.common.annotation.Api;
import com.trsier.communityagriculture.common.constant.ApiConstant;
import com.trsier.communityagriculture.config.ApiName;
import com.trsier.communityagriculture.entity.category.Category;
import com.trsier.communityagriculture.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/26.
 */
@RestController
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Api(name = ApiConstant.POST_CATEGORY)
    @RequestMapping(value = "/api/v1/categories",method = RequestMethod.POST,produces = "application/json")
    public Map<String,?extends Object> addCategory(Category category){
        return rtnParam(0,categoryService.save(category));
    }

    @Api(name=ApiConstant.GET_CATEGORY)
    @RequestMapping(value = "/api/v1/categories",method = RequestMethod.GET,produces = "application/json")
    public Map<String,?extends Object> getCategories(){
        List<Category> categories = categoryService.findAll();
        return rtnParam(0,categories);
    }

    @Api(name = ApiConstant.PUT_CATEGORY)
    @RequestMapping(value = "/api/v1/categories/{categoryId}",method = RequestMethod.PUT,produces = "application/json")
    public Map<String,?extends Object> updateCategory(@PathVariable String categoryId,Category category){
        System.out.println(category);
        Category category1 = categoryService.save(category);
        return rtnParam(0,category1);
    }

}
