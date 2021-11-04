package com.imooc.service;

import com.imooc.dataobject.SellerInfo;
import org.springframework.stereotype.Service;

/**
 * 卖家端
 * Created by keke
 * 2021/11/4 11:28
 */
public interface SellerService {
    SellerInfo findSellerInfoByOpenid(String openid);
}
