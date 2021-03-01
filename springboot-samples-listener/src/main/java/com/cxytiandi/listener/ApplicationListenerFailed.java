package com.cxytiandi.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-02-26 21:57
 */
public class ApplicationListenerFailed implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        System.err.println("进来了："+getClass().getSimpleName());
    }
}
