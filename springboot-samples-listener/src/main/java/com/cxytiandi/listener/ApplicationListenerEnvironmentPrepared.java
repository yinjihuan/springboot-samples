package com.cxytiandi.listener;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-02-26 21:55
 */
public class ApplicationListenerEnvironmentPrepared implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        System.err.println("进来了：" + getClass().getSimpleName());
    }
}
