package com.imooc.enums;

import lombok.Data;
import lombok.Getter;

/**
 * Created by keke
 * 2021/10/6 19:32
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"取消"),
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
