package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 用于数据传输的对象
 * Created by keke
 * 2021/10/10 20:37
 */
@Data
public class OrderDto {
    /** 订单id .*/
    @Id
    private String orderId;

    /**买家名字 */
    private String buyerName;

    /** 买家电话 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /**买家微信Openid */
    private String buyerOpenid;

    /** 买家订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态，默认为新下单 */
    private Integer orderStatus;

    /** 支付状态，默认为0等待支付 */
    private Integer payStatus;

    /**创建时间 */
    private Date createTime;

    /**更新时间 */
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
