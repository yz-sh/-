package com.imooc.dataobject.mapper;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by keke
 * 2021/11/4 19:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {

    @Autowired
    private  ProductCategoryMapper mapper;
    @Test
    public void insertByMap() {
        Map<String,Object> map = new HashMap<>();
        map.put("category_name","师兄最不爱");
        map.put("category_type",101);
        int res = mapper.insertByMap(map);
        Assert.assertEquals(1,res);

    }

    @Test
    public void insertByObject(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryType(102);
        productCategory.setCategoryName("都不喜欢");
        int res = mapper.insertByObject(productCategory);
        Assert.assertEquals(1,res);
    }


    @Test
    public void findByCategoryType(){
        ProductCategory res = mapper.findByCategoryType(102);
        Assert.assertNotNull(res);
    }
}