package com.imooc.enums;

import lombok.Getter;
import sun.print.DialogOwner;

/**
 * 商品状态
 * Created by keke
 * 2021/10/5 14:29
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
