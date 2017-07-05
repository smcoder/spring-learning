package com.personal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mac on 05/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        DemoPublish demoPublish = context.getBean(DemoPublish.class);

        demoPublish.publish("Hello zhiyong.lt !");
        context.close();
    }
}
