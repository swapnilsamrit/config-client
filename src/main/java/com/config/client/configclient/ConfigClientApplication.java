package com.config.client.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	@Autowired
	SampleConfig config;

	@RequestMapping(value = "/config")
	public SampleConfig sampleConfig() {
		return config;
	}

	@Value("${app.name}")
	String appName;

	@Value("${dev.name}")
	String welcomeText;

	@Value("${env.name}")
	String welcomeDev;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	@RequestMapping(value = "/")
	public String welcomeText() {
		return welcomeText;
	}

	@RequestMapping(value = "/dev")
	public String welcomedev() {
		return welcomeDev;
	}

	@RequestMapping(value = "/app")
	public String appName() {
		return appName;
	}
}
