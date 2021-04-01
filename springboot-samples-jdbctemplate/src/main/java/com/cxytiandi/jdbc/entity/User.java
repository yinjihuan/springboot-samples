package com.cxytiandi.jdbc.entity;

import lombok.Data;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-03-01 21:11
 */
@Data
public class User {

    private Integer id;

    private String name;

    private Integer stock;
    private Integer lockStock;

}
