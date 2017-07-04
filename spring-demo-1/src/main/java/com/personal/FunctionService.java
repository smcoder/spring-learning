package com.personal;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "你好" + word + "!";
    }
}
