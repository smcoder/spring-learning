package com.personal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by mac on 05/07/2017.
 */
@Configuration
@ComponentScan("com.personal")
@EnableScheduling // 开启对计划任务的支持
public class MyConfig {

}
