package com.personal;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
@Service
public class AnnotationService {

    @Action(name = "add - 1")
    public void add1() {
        System.out.println("add-1");
    }

    public void add2() {
        System.out.println("add - 2");
    }

    @Action(name = "add - 3")
    public void add3() {
        System.out.println("add - 3");
    }
}
