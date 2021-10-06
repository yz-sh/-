package com.imooc.utils;

import com.imooc.vo.ResultVo;

/**
 * Created by keke
 * 2021/10/6 17:24
 */
public class ResultVOUtil {
    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMsg("成功");

        return resultVo;
    }

    public static ResultVo success(){
        return success(null);
    }

    public static  ResultVo error(Integer code,String msg){
        ResultVo resultVo = new ResultVo();

        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
