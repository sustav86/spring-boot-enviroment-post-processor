package com.sustav.lviv;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Anton Sustavov
 * @since 2019/04/27
 */
@Service
@Profile("DEV")
public class DeveloperService {

    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork() {
        System.out.println("Developers....");
    }
}
