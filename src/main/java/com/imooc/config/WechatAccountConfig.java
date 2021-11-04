package com.imooc.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLContext;

/**
 * 微信公众号基本信息设置
 * Created by keke
 * 2021/10/23 16:06
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
    /**
     * 公众平台AppId
     */
    private String mpAppId;

    /**
     * 公众平台secret密钥
     */
    private String mpAppSecret;

    /**
     * 开发平台id
     */
    private  String openAppId;

    /**
     * 开发平台密钥
     */
    private  String openAppSecret;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /**
     * 证书内容
     */
    private SSLContext sslContext;

    /**
     * 微信支付异步通知地址
     */
    private String notifyUrl;
}
