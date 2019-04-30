package com.sustav.lviv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Anton Sustavov
 * @since 2019/04/27
 */
public class ProdListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private NotificationProp notificationProp;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        notificationProp.getMails().forEach(System.out::println);
    }
}
