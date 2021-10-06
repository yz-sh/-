package com.imooc.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by keke
 * 2021/10/5 21:24
 */
@Data
public class ResultVo<T> {

    /** 错误码 .*/
    private Integer code;

    /** 提示信息 .*/
    private String msg;

    /** 具体内容 .*/
    private T data;
}
