package com.personal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by mac on 05/07/2017.
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("dev");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("prod");
    }
}
