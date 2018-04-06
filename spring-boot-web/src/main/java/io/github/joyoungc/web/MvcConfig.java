package io.github.joyoungc.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// @Configuration
// @EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {

    //@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
          .addResourceHandler("/upload/**")
          .addResourceLocations("file:/test/upload/");
    }

}