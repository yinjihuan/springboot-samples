package com.cxytiandi.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-02-26 21:58
 */
public class ApplicationListenerPrepared implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent arg0) {
        System.err.println("进来了："+getClass().getSimpleName());
    }
}