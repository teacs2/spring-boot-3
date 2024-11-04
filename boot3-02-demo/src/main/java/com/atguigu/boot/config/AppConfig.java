package com.atguigu.boot.config;

import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public User user(){
        var user = new User();
        user.setId(1l);
        user.setName("张散");
        return user;
    }
}
