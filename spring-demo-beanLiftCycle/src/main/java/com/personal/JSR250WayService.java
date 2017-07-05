package com.personal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by mac on 05/07/2017.
 */
public class JSR250WayService {
    @PostConstruct // 构造方法执行之后执行
    public void init() {
        System.out.println("JSR250WayService - init()");
    }

    public JSR250WayService() {
        System.out.println("JSR250WayService 构造方法");
    }

    @PreDestroy // 销毁之前执行
    public void destroy() {
        System.out.println("JSR250WayService - destroy()");
    }
}
