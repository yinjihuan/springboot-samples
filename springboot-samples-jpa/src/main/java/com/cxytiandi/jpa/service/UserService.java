package com.cxytiandi.jpa.service;

import com.cxytiandi.jpa.dao.UserDao;
import com.cxytiandi.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-03-02 21:15
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> list() {
        return userDao.findAll();
    }
}
