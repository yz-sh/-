package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by keke
 * 2021/10/23 15:16
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeiXinController {
    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code){
      log.info("进入auth方法。。。");
      log.info("code={}",code);
      String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxbb21cf89b17b5220&secret=2623cdc4e4098b2df6d1993ed575302f&code="+code+"&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}",response);
    }
}
