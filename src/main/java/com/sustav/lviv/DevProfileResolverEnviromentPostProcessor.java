package com.sustav.lviv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author Anton Sustavov
 * @since 2019/04/27
 */
public class DevProfileResolverEnviromentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        environment.addActiveProfile("DEV");
        if (environment.getActiveProfiles().length == 0) {
            if (System.getenv("DESKTOP_SESSION").contains("Windows")) {
                environment.addActiveProfile("DEV");
            }
        }

    }
}
