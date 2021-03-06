package com.personal;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by mac on 05/07/2017.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
