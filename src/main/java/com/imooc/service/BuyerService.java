package com.imooc.service;

import com.imooc.dto.OrderDto;

/**
 * 买家
 * Created by keke
 * 2021/10/21 14:46
 */
public interface BuyerService {
    //查询一个订单
    OrderDto findOrderOne(String openid,String orderId);

    //取消订单
    OrderDto cancelOrder(String openid,String orderId);
}
