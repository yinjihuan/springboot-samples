package com.cxytiandi.mybatis.controller;

import com.cxytiandi.mybatis.entity.User;
import com.cxytiandi.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-03-02 21:17
 */
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> list() {
        return userService.list();
    }

}
