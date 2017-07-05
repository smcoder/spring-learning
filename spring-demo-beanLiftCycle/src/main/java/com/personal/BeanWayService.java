package com.personal;

/**
 * Created by mac on 05/07/2017.
 */
public class BeanWayService {
    public void init() {
        System.out.println("BeanWayService-init()");
    }

    public BeanWayService() {
        System.out.println("BeanWayService构造方法");
    }

    public void destroy() {
        System.out.println("BeanWayService-destroy()");
    }
}
