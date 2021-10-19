package com.imooc.converter;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDto;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 转换器
 * Created by keke
 * 2021/10/18 20:52
 */
public class OrderMaster2OrderDTOConverter {
    public  static OrderDto convert(OrderMaster orderMaster){

        OrderDto orderDto = new OrderDto();
        BeanUtils.copyProperties(orderMaster,orderDto);
        return orderDto;
    }

    public static List<OrderDto> convert(List<OrderMaster> orderMasterList){
       return orderMasterList.stream().map(e -> convert(e)).collect(Collectors.toList());
    }
}
