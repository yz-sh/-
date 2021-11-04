package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by keke
 * 2021/11/4 12:24
 */
@Data
@ConfigurationProperties (prefix = "projectUrl")
@Component
public class ProjectUrlConfig {
    /**
     * 微信公众平台Url
     */
    public  String wechatMpAuthorize;

    /**
     * 微信开发平台授权Url
     */
    public String wechatOpenAuthorize;

    /**
     * 点餐系统
     */
    public String sell;
}

