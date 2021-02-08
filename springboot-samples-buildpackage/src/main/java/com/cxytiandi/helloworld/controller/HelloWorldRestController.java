package com.cxytiandi.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个Controller示列
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-02-03 20:30
 */
@RestController
public class HelloWorldRestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

}
