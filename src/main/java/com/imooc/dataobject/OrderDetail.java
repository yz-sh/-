package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by keke
 * 2021/10/6 19:45
 */
@Entity
@Data
public class OrderDetail {


    @Id
    private String detailId;

    /** 订单id */
    private String orderId;

    /** 商品名称 */
    private String productName;

    /** 商品id */
    private String productId;

    /** 单价 */
    private BigDecimal productPrice;

    /** 商品数量 */
    private Integer productQuantity;

    /** 商品小图 */
    private String productIcon;


}
