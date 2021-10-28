package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * Created by keke
 * 2021/10/25 20:33
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for(T each : enumClass.getEnumConstants()){
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return  null;
    }
}
