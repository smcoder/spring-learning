package com.personal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by mac on 05/07/2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.personal")
public class MyMVCConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setSuffix("/WEB-INF/classes/views/");
        viewResolver.setPrefix(".jsp");
        viewResolver.setViewClass(JstlView.class);

        return viewResolver;
    }
}
