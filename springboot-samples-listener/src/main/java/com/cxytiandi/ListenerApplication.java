package com.cxytiandi;

import com.cxytiandi.listener.ApplicationListenerEnvironmentPrepared;
import com.cxytiandi.listener.ApplicationListenerFailed;
import com.cxytiandi.listener.ApplicationListenerPrepared;
import com.cxytiandi.listener.ApplicationListenerStarted;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.event.EventListener;

/**
 * 启动入口类
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2021-02-03 20:33
 */
@SpringBootApplication
public class ListenerApplication {

    public static void main(String[] args) {
        /**
         * 采用代码方式注册监听器<br>
         * 或者通过增加配置context.listener.classes=com.cxytiandi.listener.ApplicationListenerStarted
         * 多个用逗号隔开
         */
        SpringApplication application = new SpringApplication(ListenerApplication.class);
        application.addListeners(new ApplicationListenerEnvironmentPrepared());
        application.addListeners(new ApplicationListenerFailed());
        application.addListeners(new ApplicationListenerPrepared());
        application.addListeners(new ApplicationListenerStarted());
        application.run(args);
         //SpringApplication.run(ListenerApplication.class, args);
    }


}
