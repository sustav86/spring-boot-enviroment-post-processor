package com.sustav.lviv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * @author Anton Sustavov
 * @since 2019/04/27
 */
public class Conf {

    @Bean
    @Profile("prod")
    public NotificationProp notificationProp() {
        return new NotificationProp();
    }
}
