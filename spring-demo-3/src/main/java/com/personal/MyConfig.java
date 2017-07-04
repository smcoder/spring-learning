package com.personal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2017/7/4 0004.
 */
@Configuration
@ComponentScan("com.personal")
@EnableAspectJAutoProxy
public class MyConfig {
}
