package com.personal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by mac on 05/07/2017.
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("dev");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean("prod");
    }

}
