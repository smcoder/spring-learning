package com.personal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mac on 05/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ListService bean = context.getBean(ListService.class);
        System.out.println(bean.showListCmd());
        context.close();
    }
}
