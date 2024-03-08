package com.bankapp.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "msg")
//@PropertySource(value = "classpath:foo.properties")
public class MsgConfig {
    private String transferSuccess;
}
