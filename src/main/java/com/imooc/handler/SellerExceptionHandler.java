package com.imooc.handler;

import com.imooc.config.ProjectUrlConfig;
import com.imooc.exception.ResponseBankException;
import com.imooc.exception.SellException;
import com.imooc.exception.SellerAuthorException;
import com.imooc.utils.ResultVOUtil;
import com.imooc.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * 捕获登录时的异常进行处理
 * Created by keke
 * 2021/11/4 15:54
 */
@ControllerAdvice
public class SellerExceptionHandler {
    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    //拦截登录异常
    @ExceptionHandler(value = SellerAuthorException.class)
    public ModelAndView handlerAuthorizeException(){
        return new ModelAndView("redirect:".concat(projectUrlConfig.getWechatOpenAuthorize())
                                .concat("/sell/wechat/qrAuthorize")
                                .concat("?returnUrl=")
                                .concat(projectUrlConfig.getSell())
                                .concat("/sell/seller/login"));
    }
    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVo handlerSellerException(SellException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(value = ResponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handleResponseBankException(){

    }



}
