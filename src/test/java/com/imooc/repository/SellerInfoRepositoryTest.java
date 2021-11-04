package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import com.imooc.utils.KeyUtil;
import org.hibernate.hql.internal.ast.tree.AssignmentSpecification;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by keke
 * 2021/11/4 11:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoRepository repository;

    @Test
    public void save(){
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setSellerId(KeyUtil.genUniqueKey());
        sellerInfo.setUsername("admain");
        sellerInfo.setPassword("admain");
        sellerInfo.setOpenid("abc");

        SellerInfo save = repository.save(sellerInfo);
        Assert.assertNotNull(save);
    }
    @Test
    public void findByOpenid() {
        SellerInfo res = repository.findByOpenid("abc");
        Assert.assertEquals("abc",res.getOpenid());
    }
}