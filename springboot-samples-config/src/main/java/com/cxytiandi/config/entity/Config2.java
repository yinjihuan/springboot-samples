package com.cxytiandi.config.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-02-09 21:11
 */
@Data
@ConfigurationProperties(prefix = "yinjihuan")
@PropertySource({"classpath:config.properties"})
@Configuration
public class Config2 {
    private int port;
}
