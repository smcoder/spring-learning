package com.personal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mac on 05/07/2017.
 */
@Configuration
public class MyConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
}
