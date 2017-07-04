package com.personal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
// @Service 效果等同如下几种
// @Component
// @Repository
@Controller
public class UseFunctionService {
    // @Resource
    // @Repository
    @Autowired
    FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
