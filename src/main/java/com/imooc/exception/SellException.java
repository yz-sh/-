package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import lombok.Getter;

/**
 * Created by keke
 * 2021/10/10 21:57
 */
@Getter
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
