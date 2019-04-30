package com.sustav.lviv;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author Anton Sustavov
 * @since 2019/04/27
 */
@Data
@ConfigurationProperties(prefix = "prod")
public class NotificationProp {
    private List<String> mails;
}
