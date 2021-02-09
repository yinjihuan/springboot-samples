package com.cxytiandi.config.controller;

import com.cxytiandi.config.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
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
public class Config3Controller {

    @Autowired
    private Config config;

    @GetMapping("/config3/port")
    public String getConfig() {
        return String.valueOf(config.getPort());
    }

}
