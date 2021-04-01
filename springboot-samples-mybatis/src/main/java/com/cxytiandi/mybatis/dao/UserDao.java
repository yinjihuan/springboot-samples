package com.cxytiandi.mybatis.dao;

import com.cxytiandi.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-03-02 21:16
 */
@Mapper
public interface UserDao {

    //@Select("select * from t_user")
    List<User> find();

}
