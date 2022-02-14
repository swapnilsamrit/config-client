package com.config.client.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("queuesize")
public class SampleConfig {

    private String queuesize;

    public String getQueueSize() {
        return this.queuesize;
    }

    public void setQueueSize(String queueSize) {
        this.queuesize = queueSize;
    }
}