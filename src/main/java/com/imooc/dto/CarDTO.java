package com.imooc.dto;

import lombok.Data;

/**
 * 购物车
 * Created by keke
 * 2021/10/10 22:51
 */
@Data
public class CarDTO {
    /**商品id */
    private String productId;

    /**数量*/
    private Integer productQuantity;

    public CarDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
