package com.personal;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
