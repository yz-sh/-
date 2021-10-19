package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by keke
 * 2021/10/10 21:57
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}