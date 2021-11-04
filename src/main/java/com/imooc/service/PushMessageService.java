package com.imooc.service;

import com.imooc.dto.OrderDto;

/**
 * 推送消息
 * Created by keke
 * 2021/11/4 17:42
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDto
     */
    void orderStatus(OrderDto orderDto);
}
