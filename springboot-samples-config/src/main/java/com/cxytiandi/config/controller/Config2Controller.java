package com.cxytiandi.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-02-09 21:00
 */
@RestController
public class Config2Controller {

    @Value("${server.port:80}")
    private int port;

    @GetMapping("/config2/port")
    public String getConfig() {
        return String.valueOf(port);
    }

}
