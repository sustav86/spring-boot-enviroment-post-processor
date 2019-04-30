package com.sustav.lviv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(NotificationProp.class)
public class LvivApplication {

    public static void main(String[] args) {
        SpringApplication.run(LvivApplication.class, args);
    }

}
