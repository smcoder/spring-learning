package com.personal;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by mac on 05/07/2017.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("我收到了DemoEvent的事件了：" + demoEvent.getMsg());
    }
}
